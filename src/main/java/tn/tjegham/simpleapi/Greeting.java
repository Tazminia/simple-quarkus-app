package tn.tjegham.simpleapi;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.Date;

public class Greeting {

    @ConfigProperty(name = "greeting.message", defaultValue = "default greeting from quarkus")
    public String message;

    public Date creationDate = new Date();
}