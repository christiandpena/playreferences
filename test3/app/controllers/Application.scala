package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
	val p = test2.Person("Some")
    Ok(views.html.index(p.name))
  }

}