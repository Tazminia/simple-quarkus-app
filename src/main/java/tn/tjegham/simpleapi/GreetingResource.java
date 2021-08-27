package tn.tjegham.simpleapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/greeting")
public class GreetingResource {

    @GET
    public Greeting list() {
        return new Greeting();
    }
}