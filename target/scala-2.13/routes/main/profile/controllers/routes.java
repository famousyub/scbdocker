// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

package profile.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final profile.controllers.ReverseProfileController ProfileController = new profile.controllers.ReverseProfileController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final profile.controllers.javascript.ReverseProfileController ProfileController = new profile.controllers.javascript.ReverseProfileController(RoutesPrefix.byNamePrefix());
  }

}
