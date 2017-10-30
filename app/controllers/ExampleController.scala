package controllers

import play.api.libs.json.Json
import play.api.mvc.InjectedController

class ExampleController extends InjectedController {
  def index = Action {
    _ => {
      Ok(
        Json.obj("message" -> "Hello world!")
      )
    }
  }
}
