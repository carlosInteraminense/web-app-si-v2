
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object perfil_Scope0 {
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

class perfil extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[controllers.Models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: controllers.Models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/main("untitled")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
    <html lang="en">

        <head style="background-color: gray">
            <meta charset="UTF-8">
            <title>Perfil do motorista</title>
            <link rel="stylesheet" media="screen" href=""""),_display_(/*11.58*/routes/*11.64*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*11.116*/("""">
            <script src=""""),_display_(/*12.27*/routes/*12.33*/.Assets.versioned("javascripts/hello.js")),format.raw/*12.74*/("""" type="text/javascript"></script>
            <script type="text/css">
    #page-header"""),format.raw/*14.17*/("""{"""),format.raw/*14.18*/("""
    """),format.raw/*15.5*/("""text-align: center;
    background: grey !important;
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""

    """),format.raw/*19.5*/("""body"""),format.raw/*19.9*/("""{"""),format.raw/*19.10*/("""
    """),format.raw/*20.5*/("""background: blue;
    background-color: #1b6d85 !important;
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/("""

    """),format.raw/*24.5*/("""</script>
        </head>

        <body style="color: #1b6d85">
            <div  class="page-header" align="center" style="background-clip: border-box">
                <h1>Perfil <small>Motorista</small></h1>
            </div>
            <div class="row" style="background-color: #1b6d85">

                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail">
                        <img src=""""),_display_(/*35.36*/routes/*35.42*/.Assets.versioned("images/motoqueiro.jpg")),format.raw/*35.84*/("""" alt="...">
                        <div class="caption">
                            <h3>"""),_display_(/*37.34*/(usuario.getName())),format.raw/*37.53*/(""", motorista</h3>
                            <p>Informações</p>
                            <p><a href="#" class="btn btn-primary" role="button">Mudar Foto de perfil</a>
                                <a href="#" class="btn btn-default" role="button">Sair</a></p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-4">
                    <ul class="list-group">
                        <li class="list-group-item">Nome: """),_display_(/*46.60*/(usuario.getName())),format.raw/*46.79*/("""</li>
                        <li class="list-group-item">Endereco: """),_display_(/*47.64*/(usuario.getAdress())),format.raw/*47.85*/("""</li>
                        <li class="list-group-item">Telefone residencial: (83) 3333-3333</li>
                        <li class="list-group-item">Matrícula: """),_display_(/*49.65*/(usuario.getRegistration())),format.raw/*49.92*/("""</li>
                        <li class="list-group-item">Email: """),_display_(/*50.61*/(usuario.getEmail())),format.raw/*50.81*/("""</li>
                    </ul>
                </div>
                <div class="col-sm-6 col-md-3 col-lg-offset-0">
                    <div class="panel panel-primary">
                        <div class="panel-body" style="color: #2e6da4">
                            <h1>Numero de vagas</h1>
                        </div>
                        <div class="panel-footer">
                            <h2>NaN</h2>
                        </div>
                    </div>

                </div>
            </div>
            <footer class="well well-lg" style="text-align: center">
                Authored by: Caio, Carlos, Izabella, Jefferson and Yago *All rights reservated

            </footer>


        </body>
    </html>

""")))}))
      }
    }
  }

  def render(usuario:controllers.Models.User): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((controllers.Models.User) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object perfil extends perfil_Scope0.perfil
              /*
                  -- GENERATED --
                  DATE: Sat Apr 02 15:31:48 BRT 2016
                  SOURCE: /home/carlos/git/web-app-si-v2/app/views/perfil.scala.html
                  HASH: 79af0560ae1ee603f7f602cd0614e78f8ce28e38
                  MATRIX: 764->1|893->35|921->38|945->54|984->56|1012->58|1262->281|1277->287|1351->339|1407->368|1422->374|1484->415|1600->503|1629->504|1661->509|1745->566|1773->567|1806->573|1837->577|1866->578|1898->583|1989->647|2017->648|2050->654|2500->1077|2515->1083|2578->1125|2697->1217|2737->1236|3261->1733|3301->1752|3397->1821|3439->1842|3630->2006|3678->2033|3771->2099|3812->2119
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|46->15|48->17|48->17|50->19|50->19|50->19|51->20|53->22|53->22|55->24|66->35|66->35|66->35|68->37|68->37|77->46|77->46|78->47|78->47|80->49|80->49|81->50|81->50
                  -- GENERATED --
              */
          