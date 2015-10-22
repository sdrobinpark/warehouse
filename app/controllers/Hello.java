package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Hello extends Controller{
	public Result hello(String name) {
		return ok(hellowelcomepage.render(name));
	}
	public Result html5(){
		return ok(html5.render());
}
}