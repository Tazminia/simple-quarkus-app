package tn.tjegham.simpleapi;

import java.util.Date;

public class Greeting {
    public static final String DEFAULT_GREETING_MESSAGE = "Default greeting message";
    private String message;
    private final Date creationDate;

    public Greeting(){
        this.message = DEFAULT_GREETING_MESSAGE;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}