package tn.tjegham.simpleapi;

import java.util.Date;

public class Greeting {
    public String name;
    public Date creationDate;

    public Greeting(){
        this.creationDate = new Date();
    }

    public Greeting(String name){
        this.name = name;
        this.creationDate = new Date();
    }
}