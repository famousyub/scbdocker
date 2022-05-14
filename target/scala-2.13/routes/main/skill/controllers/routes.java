// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

package skill.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final skill.controllers.ReverseSkillController SkillController = new skill.controllers.ReverseSkillController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final skill.controllers.javascript.ReverseSkillController SkillController = new skill.controllers.javascript.ReverseSkillController(RoutesPrefix.byNamePrefix());
  }

}
