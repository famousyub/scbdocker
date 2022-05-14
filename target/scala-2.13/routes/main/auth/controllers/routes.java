// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

package auth.controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final auth.controllers.ReverseAuthController AuthController = new auth.controllers.ReverseAuthController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final auth.controllers.javascript.ReverseAuthController AuthController = new auth.controllers.javascript.ReverseAuthController(RoutesPrefix.byNamePrefix());
  }

}
