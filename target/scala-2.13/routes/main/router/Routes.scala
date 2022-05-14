// @GENERATOR:play-routes-compiler
// @SOURCE:/home/user/Bureau/myscalapr/scala-play-skills-tracker/conf/routes
// @DATE:Fri May 13 17:56:37 CET 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  ProfileController_1: profile.controllers.ProfileController,
  // @LINE:8
  SkillController_2: skill.controllers.SkillController,
  // @LINE:14
  AchievementController_0: achievement.controllers.AchievementController,
  // @LINE:20
  AuthController_3: auth.controllers.AuthController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    ProfileController_1: profile.controllers.ProfileController,
    // @LINE:8
    SkillController_2: skill.controllers.SkillController,
    // @LINE:14
    AchievementController_0: achievement.controllers.AchievementController,
    // @LINE:20
    AuthController_3: auth.controllers.AuthController
  ) = this(errorHandler, ProfileController_1, SkillController_2, AchievementController_0, AuthController_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProfileController_1, SkillController_2, AchievementController_0, AuthController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles""", """profile.controllers.ProfileController.getProfiles"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles""", """profile.controllers.ProfileController.createProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/""" + "$" + """id<[^/]+>""", """profile.controllers.ProfileController.getProfileById(id:java.util.UUID)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/""" + "$" + """id<[^/]+>""", """profile.controllers.ProfileController.deleteProfileById(id:java.util.UUID)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/""" + "$" + """id<[^/]+>""", """profile.controllers.ProfileController.updateProfileById(id:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """skills""", """skill.controllers.SkillController.getSkills"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """skills""", """skill.controllers.SkillController.createSkill"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """skills/""" + "$" + """id<[^/]+>""", """skill.controllers.SkillController.getSkillById(id:java.util.UUID)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """skills/""" + "$" + """id<[^/]+>""", """skill.controllers.SkillController.deleteSkillById(id:java.util.UUID)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """skills/""" + "$" + """id<[^/]+>""", """skill.controllers.SkillController.updateSkillById(id:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """achievements""", """achievement.controllers.AchievementController.getAchievements"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """achievements""", """achievement.controllers.AchievementController.createAchievement"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """achievements/""" + "$" + """id<[^/]+>""", """achievement.controllers.AchievementController.getAchievementById(id:java.util.UUID)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """achievements/""" + "$" + """id<[^/]+>""", """achievement.controllers.AchievementController.deleteAchievementById(id:java.util.UUID)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """achievements/""" + "$" + """id<[^/]+>""", """achievement.controllers.AchievementController.updateAchievementById(id:java.util.UUID)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """auth.controllers.AuthController.login"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val profile_controllers_ProfileController_getProfiles0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles")))
  )
  private[this] lazy val profile_controllers_ProfileController_getProfiles0_invoker = createInvoker(
    ProfileController_1.getProfiles,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "profile.controllers.ProfileController",
      "getProfiles",
      Nil,
      "GET",
      this.prefix + """profiles""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val profile_controllers_ProfileController_createProfile1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles")))
  )
  private[this] lazy val profile_controllers_ProfileController_createProfile1_invoker = createInvoker(
    ProfileController_1.createProfile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "profile.controllers.ProfileController",
      "createProfile",
      Nil,
      "POST",
      this.prefix + """profiles""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val profile_controllers_ProfileController_getProfileById2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val profile_controllers_ProfileController_getProfileById2_invoker = createInvoker(
    ProfileController_1.getProfileById(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "profile.controllers.ProfileController",
      "getProfileById",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """profiles/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val profile_controllers_ProfileController_deleteProfileById3_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val profile_controllers_ProfileController_deleteProfileById3_invoker = createInvoker(
    ProfileController_1.deleteProfileById(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "profile.controllers.ProfileController",
      "deleteProfileById",
      Seq(classOf[java.util.UUID]),
      "DELETE",
      this.prefix + """profiles/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val profile_controllers_ProfileController_updateProfileById4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val profile_controllers_ProfileController_updateProfileById4_invoker = createInvoker(
    ProfileController_1.updateProfileById(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "profile.controllers.ProfileController",
      "updateProfileById",
      Seq(classOf[java.util.UUID]),
      "PUT",
      this.prefix + """profiles/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val skill_controllers_SkillController_getSkills5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("skills")))
  )
  private[this] lazy val skill_controllers_SkillController_getSkills5_invoker = createInvoker(
    SkillController_2.getSkills,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "skill.controllers.SkillController",
      "getSkills",
      Nil,
      "GET",
      this.prefix + """skills""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val skill_controllers_SkillController_createSkill6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("skills")))
  )
  private[this] lazy val skill_controllers_SkillController_createSkill6_invoker = createInvoker(
    SkillController_2.createSkill,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "skill.controllers.SkillController",
      "createSkill",
      Nil,
      "POST",
      this.prefix + """skills""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val skill_controllers_SkillController_getSkillById7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("skills/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val skill_controllers_SkillController_getSkillById7_invoker = createInvoker(
    SkillController_2.getSkillById(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "skill.controllers.SkillController",
      "getSkillById",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """skills/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val skill_controllers_SkillController_deleteSkillById8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("skills/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val skill_controllers_SkillController_deleteSkillById8_invoker = createInvoker(
    SkillController_2.deleteSkillById(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "skill.controllers.SkillController",
      "deleteSkillById",
      Seq(classOf[java.util.UUID]),
      "DELETE",
      this.prefix + """skills/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val skill_controllers_SkillController_updateSkillById9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("skills/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val skill_controllers_SkillController_updateSkillById9_invoker = createInvoker(
    SkillController_2.updateSkillById(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "skill.controllers.SkillController",
      "updateSkillById",
      Seq(classOf[java.util.UUID]),
      "PUT",
      this.prefix + """skills/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val achievement_controllers_AchievementController_getAchievements10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("achievements")))
  )
  private[this] lazy val achievement_controllers_AchievementController_getAchievements10_invoker = createInvoker(
    AchievementController_0.getAchievements,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "achievement.controllers.AchievementController",
      "getAchievements",
      Nil,
      "GET",
      this.prefix + """achievements""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val achievement_controllers_AchievementController_createAchievement11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("achievements")))
  )
  private[this] lazy val achievement_controllers_AchievementController_createAchievement11_invoker = createInvoker(
    AchievementController_0.createAchievement,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "achievement.controllers.AchievementController",
      "createAchievement",
      Nil,
      "POST",
      this.prefix + """achievements""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val achievement_controllers_AchievementController_getAchievementById12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("achievements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val achievement_controllers_AchievementController_getAchievementById12_invoker = createInvoker(
    AchievementController_0.getAchievementById(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "achievement.controllers.AchievementController",
      "getAchievementById",
      Seq(classOf[java.util.UUID]),
      "GET",
      this.prefix + """achievements/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val achievement_controllers_AchievementController_deleteAchievementById13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("achievements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val achievement_controllers_AchievementController_deleteAchievementById13_invoker = createInvoker(
    AchievementController_0.deleteAchievementById(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "achievement.controllers.AchievementController",
      "deleteAchievementById",
      Seq(classOf[java.util.UUID]),
      "DELETE",
      this.prefix + """achievements/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val achievement_controllers_AchievementController_updateAchievementById14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("achievements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val achievement_controllers_AchievementController_updateAchievementById14_invoker = createInvoker(
    AchievementController_0.updateAchievementById(fakeValue[java.util.UUID]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "achievement.controllers.AchievementController",
      "updateAchievementById",
      Seq(classOf[java.util.UUID]),
      "PUT",
      this.prefix + """achievements/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val auth_controllers_AuthController_login15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val auth_controllers_AuthController_login15_invoker = createInvoker(
    AuthController_3.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "auth.controllers.AuthController",
      "login",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case profile_controllers_ProfileController_getProfiles0_route(params@_) =>
      call { 
        profile_controllers_ProfileController_getProfiles0_invoker.call(ProfileController_1.getProfiles)
      }
  
    // @LINE:2
    case profile_controllers_ProfileController_createProfile1_route(params@_) =>
      call { 
        profile_controllers_ProfileController_createProfile1_invoker.call(ProfileController_1.createProfile)
      }
  
    // @LINE:3
    case profile_controllers_ProfileController_getProfileById2_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        profile_controllers_ProfileController_getProfileById2_invoker.call(ProfileController_1.getProfileById(id))
      }
  
    // @LINE:5
    case profile_controllers_ProfileController_deleteProfileById3_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        profile_controllers_ProfileController_deleteProfileById3_invoker.call(ProfileController_1.deleteProfileById(id))
      }
  
    // @LINE:6
    case profile_controllers_ProfileController_updateProfileById4_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        profile_controllers_ProfileController_updateProfileById4_invoker.call(ProfileController_1.updateProfileById(id))
      }
  
    // @LINE:8
    case skill_controllers_SkillController_getSkills5_route(params@_) =>
      call { 
        skill_controllers_SkillController_getSkills5_invoker.call(SkillController_2.getSkills)
      }
  
    // @LINE:9
    case skill_controllers_SkillController_createSkill6_route(params@_) =>
      call { 
        skill_controllers_SkillController_createSkill6_invoker.call(SkillController_2.createSkill)
      }
  
    // @LINE:10
    case skill_controllers_SkillController_getSkillById7_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        skill_controllers_SkillController_getSkillById7_invoker.call(SkillController_2.getSkillById(id))
      }
  
    // @LINE:11
    case skill_controllers_SkillController_deleteSkillById8_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        skill_controllers_SkillController_deleteSkillById8_invoker.call(SkillController_2.deleteSkillById(id))
      }
  
    // @LINE:12
    case skill_controllers_SkillController_updateSkillById9_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        skill_controllers_SkillController_updateSkillById9_invoker.call(SkillController_2.updateSkillById(id))
      }
  
    // @LINE:14
    case achievement_controllers_AchievementController_getAchievements10_route(params@_) =>
      call { 
        achievement_controllers_AchievementController_getAchievements10_invoker.call(AchievementController_0.getAchievements)
      }
  
    // @LINE:15
    case achievement_controllers_AchievementController_createAchievement11_route(params@_) =>
      call { 
        achievement_controllers_AchievementController_createAchievement11_invoker.call(AchievementController_0.createAchievement)
      }
  
    // @LINE:16
    case achievement_controllers_AchievementController_getAchievementById12_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        achievement_controllers_AchievementController_getAchievementById12_invoker.call(AchievementController_0.getAchievementById(id))
      }
  
    // @LINE:17
    case achievement_controllers_AchievementController_deleteAchievementById13_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        achievement_controllers_AchievementController_deleteAchievementById13_invoker.call(AchievementController_0.deleteAchievementById(id))
      }
  
    // @LINE:18
    case achievement_controllers_AchievementController_updateAchievementById14_route(params@_) =>
      call(params.fromPath[java.util.UUID]("id", None)) { (id) =>
        achievement_controllers_AchievementController_updateAchievementById14_invoker.call(AchievementController_0.updateAchievementById(id))
      }
  
    // @LINE:20
    case auth_controllers_AuthController_login15_route(params@_) =>
      call { 
        auth_controllers_AuthController_login15_invoker.call(AuthController_3.login)
      }
  }
}
