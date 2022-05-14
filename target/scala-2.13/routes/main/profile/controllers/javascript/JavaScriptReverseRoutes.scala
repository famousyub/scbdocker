// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package profile.controllers.javascript {

  // @LINE:1
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def updateProfileById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "profile.controllers.ProfileController.updateProfileById",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "profiles/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:2
    def createProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "profile.controllers.ProfileController.createProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "profiles"})
        }
      """
    )
  
    // @LINE:5
    def deleteProfileById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "profile.controllers.ProfileController.deleteProfileById",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "profiles/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:1
    def getProfiles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "profile.controllers.ProfileController.getProfiles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profiles"})
        }
      """
    )
  
    // @LINE:3
    def getProfileById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "profile.controllers.ProfileController.getProfileById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profiles/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
