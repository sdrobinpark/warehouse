package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Signin extends Controller{
	public Result signin() {
		return ok(signin.render());
	}
}
