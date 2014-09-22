package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok("Hola Mundo");
    }

    public static Result hello(String name) {
    	return ok("Hola " + name);
    }
  
}
