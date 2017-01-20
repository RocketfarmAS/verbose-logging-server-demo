package controllers;

import play.mvc.*;

import views.html.*;

import java.util.Random;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        if(new Random().nextInt(100) < 2)
            return internalServerError();

        return ok(index.render("index"));
    }

    public Result app(){
        if(new Random().nextInt(100) < 2)
            return internalServerError();

        return ok(index.render("app"));
    }
    public Result list(){
        if(new Random().nextInt(100) < 2)
            return internalServerError();

        return ok(index.render("list"));
    }
    public Result test(){
        if(new Random().nextInt(100) < 2)
            return internalServerError();

        return ok(index.render("test"));
    }
    public Result log(){
        if(new Random().nextInt(100) < 2)
            return internalServerError();

        return ok(index.render("log"));
    }


}
