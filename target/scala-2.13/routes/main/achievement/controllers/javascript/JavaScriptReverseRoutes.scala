// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:14
package achievement.controllers.javascript {

  // @LINE:14
  class ReverseAchievementController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def deleteAchievementById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "achievement.controllers.AchievementController.deleteAchievementById",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "achievements/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:18
    def updateAchievementById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "achievement.controllers.AchievementController.updateAchievementById",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "achievements/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:15
    def createAchievement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "achievement.controllers.AchievementController.createAchievement",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "achievements"})
        }
      """
    )
  
    // @LINE:14
    def getAchievements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "achievement.controllers.AchievementController.getAchievements",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "achievements"})
        }
      """
    )
  
    // @LINE:16
    def getAchievementById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "achievement.controllers.AchievementController.getAchievementById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "achievements/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
