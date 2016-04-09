package controllers;

import static controllers.UserController.showRegister;
import static play.data.Form.form;

import java.util.List;

import controllers.Models.User;
import play.mvc.Controller;
import play.data.Form;
import play.mvc.Result;
import DBManager.*;

public class UserController extends Controller{

    private static Form<User> loginForm = form(User.class).bindFromRequest();
    private static DBManager db = null;
    private static User actualUser;

    public static Result showLogin(String mensagem, boolean erro) {
        return ok(views.html.login.render(loginForm, mensagem, erro));
    }

    public static Result showLogin() {
        return showLogin("", false);
    }

    private static boolean validar(String email, String senha, DBManager dataBaseManager) {
        User user = dataBaseManager.searchUserByEmail(email);
        if (user == null) {
            return false;
        }
        if (!user.getPassword().equals(senha)) {
            return false;
        }
        return true;
    }

    public static Result showPerfil(){
        User user = getUser();

        if (user.getIsDriver())
        {
            return ok(views.html.perfilDriver.render(user));
        }
        return ok(views.html.perfilPassenger.render());


    }

    public static Result authenticate() {
        if(db == null){
            try{
                db = new DBManager();
            }
            catch (Exception e){}
        }

        Form<User> form = form(User.class).bindFromRequest();

        String email = form.field("email").value();
        String senha = form.field("password").value();

        if (email == null || senha == null) {
            return showLogin("Ocorreu um erro. Tente novamente.", true);
        } else if (!validar(email, senha, db)) {
            return showLogin("E-mail ou senha Inválidos", true);
        } else {
            User user = db.searchUserByEmail(email);
            actualUser = user;
            session().clear();
            session("email", user.getEmail());
            if(user.getIsFirstLogin())
            {
                user.setIsFirstLogin(false);
            }
            return showPerfil();
        }
    }

    public static User getUser() {

        return actualUser;
    }

    public static boolean isRegisteredEmail(String email)
    {
        return db.searchUserByEmail(email) != null;
    }

    public static Result showRegister(String mensagem) {
        return ok(views.html.register.render(loginForm, mensagem));
    }

    public static Result showRegister() {
        return showRegister("");
    }

    private static boolean isRegistrationValid(String registration)
    {
        int intRegistration = Integer.parseInt(registration);

        return (!registration.trim().equals("")) && (registration.length() == 9) && (intRegistration > 100000000 && intRegistration < 115199999);
    }

    public static Result register() {

        if(db == null) {
            try {
                db = new DBManager();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Form<User> form = loginForm.bindFromRequest();

        String name = form.field("name").value();
        String registration = form.field("registration").value();
        String phoneNumber = form.field("phone-number").value();
        String email = form.field("email").value();
        String password = form.field("password").value();
        String newPassword = form.field("new-password").value();
        String driver = form.field("driver").value();
        String passenger = form.field("passenger").value();
        String numberPassenges = form.field("numberPassenges").value();
        String destinationAddress = form.field("district").value();
        String houseNumber = form.field("house-number").value();


        boolean isDriver = false;

        if (name == null || email == null || password == null ||registration == null || destinationAddress == null
                || houseNumber == null) {
            return showRegister("An error ocurred. Please, try again.");

        } else if(name.trim().equals("")){
            return showRegister("Invalid name");
        } else if(!isRegistrationValid(registration)) {
            return showRegister("Invalid Registration");

        } else if (db.searchUserByRegistration(registration) != null) {
            return showRegister("Registration aready registered");

        } else if(email.trim().equals("")) {
            return showRegister("Invalid Email");

        } else if (isRegisteredEmail(email)) {
            return showRegister("E-mail already registered");

        } else if (password.trim().equals("")) {
            return showRegister("Invalid Password");

        } else if(!password.equals(newPassword)) {
            return showRegister("The passwords don't match");

        }else if (destinationAddress.trim().equals("")){
            return showRegister("Invalid District");

        }else if(houseNumber.trim().equals(""))
        {
            return showRegister("House number invalid");
        }
        else if (driver == null && passenger == null){
            return showRegister("Select the type of user, Driver or Passenger.");

        } else if(driver != null) {
            if(numberPassenges == null || numberPassenges.trim().equals("")) {
                return showRegister("If you are a driver, put the number of passenger");
            }
            isDriver = true;

        } else {
            User user = null;
            try {
                user = new User(name, registration, email, password, isDriver, destinationAddress, Integer.parseInt(houseNumber));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(user != null) {
                db.writeInDataBase(user);
            }
        }

        return showLogin("User successfully registered", false);

    }

    public static Result logout() {
        session().clear();
        return showLogin("Deslogado com sucesso", false);
    }

}