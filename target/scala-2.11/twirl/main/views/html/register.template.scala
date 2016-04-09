
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[controllers.Models.User],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: play.data.Form[controllers.Models.User], errorMesage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

"""),_display_(/*3.2*/main("Carona")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
  <html lang="en">
    <head>
      <meta name="viewport" content="width=device-width", initial-scale=1.0 charset="UTF-8" />
      <title>Carona</title>
      <link rel="stylesheet" media="screen" href=""""),_display_(/*9.52*/routes/*9.58*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*9.110*/("""">
      <link rel="stylesheet" href="styles.css">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*11.52*/routes/*11.58*/.Assets.versioned("stylesheets/login-style.css")),format.raw/*11.106*/("""">

    </head>
    <body>

      <div id="header">
        <h1>Carona</h1>
      </div>

      <div id="fields-sign-up" class="forms">

        <div id="Register"class="text-center" >
          <div class="logo">Register</div>
        </div>

        """),_display_(/*26.10*/if(errorMesage != null && !errorMesage.trim().equals(""))/*26.67*/ {_display_(Seq[Any](format.raw/*26.69*/("""
          """),format.raw/*27.11*/("""<div class="alert alert-danger">
            <p>"""),_display_(/*28.17*/(errorMesage)),format.raw/*28.30*/("""</p>
          </div>
        """)))}),format.raw/*30.10*/("""

        """),_display_(/*32.10*/helper/*32.16*/.form(routes.UserController.register())/*32.55*/ {_display_(Seq[Any](format.raw/*32.57*/("""
          """),format.raw/*33.11*/("""<div id="input-name" class="input">
            <input type="text" name="name" class="form-control" placeholder="Name"/>
          </div>

          <div id="input-registration" class="input">
            <input type="text" name="registration" class="form-control" placeholder="Registration"/>
          </div>

          <div id="input-phone-number" class="input">
            <input type="text" name="phone-number" class="form-control" placeholder="Phone Number"/>
          </div>

          <div id="input-email" class="input">
            <input type="email" name="email" class="form-control" placeholder="Email"/>
          </div>

          <div id="input-password" class="input">
            <input type="password" name="password" class="form-control" placeholder="Password">
          </div>

          <div id="input-new-password" class="input">
            <input type="password" name="new-password" class="form-control" placeholder="Confirm password">
          </div>

          <div id="input-adress" class="input">
            <input type="text" name="district" class="form-control" placeholder="District"/>
          </div>

          <div id="input-adress" class="input">
            <input type="text" name="house-number" class="form-control" placeholder="House Number"/>
          </div>

          <div id="choose-type-user">
            <input type="radio" name="driver" onclick="show_n_vagas()"  id="is-driver" value="track"/>Driver
            <input type="radio"  name="passenger" onclick="hide_n_vagas()" id="is-passenger" checked />Passenger
          </div>

          <div id="input-number-passenger" class="input" style="visibility: hidden;display: none">
            <input type="text" name ="numberPassenges" class="form-control" placeholder="Number of Passenger"/>
          </div>

          <button id="btn-register" type="submit" class="login-button"> Register
            <i class="fa fa-chevron-right"></i></button>

        """)))}),format.raw/*77.10*/("""

        """),format.raw/*79.9*/("""<div id="login-now" class="etc-login-form" style="margin-bottom: 30px;">
          Do you have an account? <a href="#" onclick="login_click()">Login now</a>
        </div>

      </div>

      <footer class="well well-lg" style="text-align: center">
        Authored by: Caio, Carlos, Izabella, Jefferson and Yago *All rights reservated
      </footer>


      <script>
              function hide_n_vagas()"""),format.raw/*91.38*/("""{"""),format.raw/*91.39*/("""
                """),format.raw/*92.17*/("""var remember = document.getElementById('is-passenger');
                var driver = document.getElementById('is-driver');
                if (remember.checked)"""),format.raw/*94.38*/("""{"""),format.raw/*94.39*/("""
                  """),format.raw/*95.19*/("""driver.checked = false;
                  document.getElementById('input-number-passenger').setAttribute('style','visibility:hidden; display:none');

                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""else"""),format.raw/*98.22*/("""{"""),format.raw/*98.23*/("""
                  """),format.raw/*99.19*/("""driver.checked = true;
                  document.getElementById('input-number-passenger').setAttribute('style','visibility:visible;margin-bottom: 10px');
                """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/("""
              """),format.raw/*102.15*/("""}"""),format.raw/*102.16*/(""";


              function show_n_vagas()"""),format.raw/*105.38*/("""{"""),format.raw/*105.39*/("""
                """),format.raw/*106.17*/("""var remember = document.getElementById('is-driver');
                var passenger = document.getElementById('is-passenger');
                if (remember.checked)"""),format.raw/*108.38*/("""{"""),format.raw/*108.39*/("""
                  """),format.raw/*109.19*/("""passenger.checked = false;
                  document.getElementById('input-number-passenger').setAttribute('style','visibility:visible;margin-bottom: 10px');

                """),format.raw/*112.17*/("""}"""),format.raw/*112.18*/("""else"""),format.raw/*112.22*/("""{"""),format.raw/*112.23*/("""
                  """),format.raw/*113.19*/("""passenger.checked = true;
                  document.getElementById('input-number-passenger').setAttribute('style','visibility:hidden; display:none');
                """),format.raw/*115.17*/("""}"""),format.raw/*115.18*/("""
              """),format.raw/*116.15*/("""}"""),format.raw/*116.16*/(""";

              function login_click()"""),format.raw/*118.37*/("""{"""),format.raw/*118.38*/("""
                """),format.raw/*119.17*/("""window.location.href = "http://localhost:9000/login"
              """),format.raw/*120.15*/("""}"""),format.raw/*120.16*/(""";


      </script>


    </body>
  </html>

""")))}),format.raw/*129.2*/("""
"""))
      }
    }
  }

  def render(form:play.data.Form[controllers.Models.User],errorMesage:String): play.twirl.api.HtmlFormat.Appendable = apply(form,errorMesage)

  def f:((play.data.Form[controllers.Models.User],String) => play.twirl.api.HtmlFormat.Appendable) = (form,errorMesage) => apply(form,errorMesage)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Fri Apr 08 14:14:18 BRT 2016
                  SOURCE: /home/carlos/git/web-app-si-v2/app/views/register.scala.html
                  HASH: 26cca4dfc9b13ab23afd81bc3be441eb3b290db6
                  MATRIX: 791->1|954->69|982->72|1004->86|1043->88|1070->89|1316->309|1330->315|1403->367|1532->469|1547->475|1617->523|1897->776|1963->833|2003->835|2042->846|2118->895|2152->908|2214->939|2252->950|2267->956|2315->995|2355->997|2394->1008|4388->2971|4425->2981|4860->3388|4889->3389|4934->3406|5122->3566|5151->3567|5198->3586|5392->3752|5421->3753|5453->3757|5482->3758|5529->3777|5729->3948|5759->3949|5803->3964|5833->3965|5903->4006|5933->4007|5979->4024|6171->4187|6201->4188|6249->4207|6454->4383|6484->4384|6517->4388|6547->4389|6595->4408|6791->4575|6821->4576|6865->4591|6895->4592|6963->4631|6993->4632|7039->4649|7135->4716|7165->4717|7242->4763
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|40->9|40->9|40->9|42->11|42->11|42->11|57->26|57->26|57->26|58->27|59->28|59->28|61->30|63->32|63->32|63->32|63->32|64->33|108->77|110->79|122->91|122->91|123->92|125->94|125->94|126->95|129->98|129->98|129->98|129->98|130->99|132->101|132->101|133->102|133->102|136->105|136->105|137->106|139->108|139->108|140->109|143->112|143->112|143->112|143->112|144->113|146->115|146->115|147->116|147->116|149->118|149->118|150->119|151->120|151->120|160->129
                  -- GENERATED --
              */
          