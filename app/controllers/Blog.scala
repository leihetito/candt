package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import views._

import models._

object Blog extends Controller {

  def index = Action {
    Ok(html.blog());
  }

}