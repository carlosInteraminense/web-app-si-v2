
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

          <div id="choose-type-user">
            <input type="checkbox" onclick="validate()" name="driver" id="is-driver" value="track" /><label for="track">Driver</label>
            <input type="checkbox"  name="passenger" id="is-passenger" value="message" /><label for="message">Passenger</label>
          </div>

          <div id="input-number-passenger" class="input" style="visibility: hidden;display: none">
            <input type="text" name ="numberPassenges" class="form-control" placeholder="Number of Passenger"/>
          </div>

          <button id="btn-register" type="submit" class="login-button"> Register
            <i class="fa fa-chevron-right"></i></button>

        """)))}),format.raw/*69.10*/("""

        """),format.raw/*71.9*/("""<div id="login-now" class="etc-login-form" style="margin-bottom: 30px;">
          Do you have an account? <a href="#" onclick="login_click()">Login now</a>
        </div>

      </div>

      <footer class="well well-lg" style="text-align: center">
        Authored by: Caio, Carlos, Izabella, Jefferson and Yago *All rights reservated
      </footer>


      <script>
              function validate()"""),format.raw/*83.34*/("""{"""),format.raw/*83.35*/("""
                """),format.raw/*84.17*/("""var remember = document.getElementById('is-driver');
                if (remember.checked)"""),format.raw/*85.38*/("""{"""),format.raw/*85.39*/("""

                  """),format.raw/*87.19*/("""document.getElementById('input-number-passenger').setAttribute('style','visibility:visible;margin-bottom: 10px');

                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/("""else"""),format.raw/*89.22*/("""{"""),format.raw/*89.23*/("""

                  """),format.raw/*91.19*/("""document.getElementById('input-number-passenger').setAttribute('style','visibility:hidden; display:none');
                """),format.raw/*92.17*/("""}"""),format.raw/*92.18*/("""
              """),format.raw/*93.15*/("""}"""),format.raw/*93.16*/(""";

              function login_click()"""),format.raw/*95.37*/("""{"""),format.raw/*95.38*/("""
                """),format.raw/*96.17*/("""window.location.href = "http://localhost:9000/login"
              """),format.raw/*97.15*/("""}"""),format.raw/*97.16*/(""";


      </script>


    </body>
  </html>

""")))}),format.raw/*106.2*/("""
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
                  DATE: Sat Apr 02 16:15:30 BRT 2016
                  SOURCE: /home/carlos/git/web-app-si-v2/app/views/register.scala.html
                  HASH: b71ec111d84f5014cf8bd518aedb55949391ce6c
                  MATRIX: 791->1|954->69|982->72|1004->86|1043->88|1070->89|1316->309|1330->315|1403->367|1532->469|1547->475|1617->523|1897->776|1963->833|2003->835|2042->846|2118->895|2152->908|2214->939|2252->950|2267->956|2315->995|2355->997|2394->1008|4103->2686|4140->2696|4571->3099|4600->3100|4645->3117|4763->3207|4792->3208|4840->3228|4999->3359|5028->3360|5060->3364|5089->3365|5137->3385|5288->3508|5317->3509|5360->3524|5389->3525|5456->3564|5485->3565|5530->3582|5625->3649|5654->3650|5731->3696
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|40->9|40->9|40->9|42->11|42->11|42->11|57->26|57->26|57->26|58->27|59->28|59->28|61->30|63->32|63->32|63->32|63->32|64->33|100->69|102->71|114->83|114->83|115->84|116->85|116->85|118->87|120->89|120->89|120->89|120->89|122->91|123->92|123->92|124->93|124->93|126->95|126->95|127->96|128->97|128->97|137->106
                  -- GENERATED --
              */
          