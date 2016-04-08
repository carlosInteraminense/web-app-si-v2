
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/carlos/git/web-app-si-v2/conf/routes
// @DATE:Wed Apr 06 00:54:25 BRT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
