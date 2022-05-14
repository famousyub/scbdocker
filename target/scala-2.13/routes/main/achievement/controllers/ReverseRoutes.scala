// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:14
package achievement.controllers {

  // @LINE:14
  class ReverseAchievementController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def deleteAchievementById(id:java.util.UUID): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "achievements/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
    // @LINE:18
    def updateAchievementById(id:java.util.UUID): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "achievements/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
    // @LINE:15
    def createAchievement(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "achievements")
    }
  
    // @LINE:14
    def getAchievements(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "achievements")
    }
  
    // @LINE:16
    def getAchievementById(id:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "achievements/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
  }


}
