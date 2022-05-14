// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package profile.controllers {

  // @LINE:1
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def updateProfileById(id:java.util.UUID): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "profiles/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
    // @LINE:2
    def createProfile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "profiles")
    }
  
    // @LINE:5
    def deleteProfileById(id:java.util.UUID): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "profiles/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
    // @LINE:1
    def getProfiles(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profiles")
    }
  
    // @LINE:3
    def getProfileById(id:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profiles/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
  }


}
