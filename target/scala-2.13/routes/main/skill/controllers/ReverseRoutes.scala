// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:8
package skill.controllers {

  // @LINE:8
  class ReverseSkillController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def deleteSkillById(id:java.util.UUID): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "skills/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
    // @LINE:8
    def getSkills(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "skills")
    }
  
    // @LINE:12
    def updateSkillById(id:java.util.UUID): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "skills/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
    // @LINE:9
    def createSkill(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "skills")
    }
  
    // @LINE:10
    def getSkillById(id:java.util.UUID): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "skills/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[java.util.UUID]].unbind("id", id)))
    }
  
  }


}
