package tn.tjegham.simpleapi;

import java.util.Date;

public class Greeting {
    public String message;
    public Date creationDate;

    public Greeting(){
        this.message = "Default greeting message";
        this.creationDate = new Date();
    }

    public Greeting(String message){
        this.message = message;
        this.creationDate = new Date();
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (!(o instanceof Greeting)) return false;
        final Greeting greeting = (Greeting) o;
        if (!(this.message.equals(greeting.message))) return false;
        return true;
    }
}