package tn.tjegham.simpleapi;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {

    private Greeting greeting = new Greeting("Simple greeting message");

    @GET
    public Greeting list() {
        return greeting;
    }
}