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
            return redirect(routes.Application.index());
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


    public static Result register() {

        if(db == null)
        {
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



        if (name == null || email == null || password == null)
        {
            return showRegister("Ocorreu um erro. Tente novamente");

        }
        else if(name.trim().equals(""))
        {
            return showRegister("Nome inválido");
        }

        else if(email.trim().equals(""))
        {
            return showRegister("Email inválido");
        }
        else if (isRegisteredEmail(email))
        {
            return showRegister("E-mail já cadastrado");
        }
        else if (password.trim().equals(""))
        {
            return showRegister("Senha Inválda");
        }
        else if(!password.equals(newPassword))
        {
            return showRegister("As senhas nao correspondem");
        }
        else {
            User user = null;
            try {
                user = new User(name, registration, email, password);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(user != null)
            {
                db.writeInDataBase(user);
            }

            return showLogin("Usuário cadastrado com sucesso", false);
        }
    }


    public static Result logout() {
        session().clear();
        return showLogin("Deslogado com sucesso", false);
    }

}