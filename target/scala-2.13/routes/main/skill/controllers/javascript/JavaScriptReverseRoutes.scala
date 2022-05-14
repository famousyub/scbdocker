// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:8
package skill.controllers.javascript {

  // @LINE:8
  class ReverseSkillController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def deleteSkillById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "skill.controllers.SkillController.deleteSkillById",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "skills/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:8
    def getSkills: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "skill.controllers.SkillController.getSkills",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "skills"})
        }
      """
    )
  
    // @LINE:12
    def updateSkillById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "skill.controllers.SkillController.updateSkillById",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "skills/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:9
    def createSkill: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "skill.controllers.SkillController.createSkill",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "skills"})
        }
      """
    )
  
    // @LINE:10
    def getSkillById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "skill.controllers.SkillController.getSkillById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "skills/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[java.util.UUID]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
