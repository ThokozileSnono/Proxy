import java.awt.*;
import java.util.Date;

public class Proxy {

    Slowthing slowthing;

    public Proxy(){
        System.out.println("Craeting proxy at " + new Date());
    }

    public void sayHello(){
        if (slowthing == null){
            slowthing = new Slowthing();
        }
        slowthing.sayHello();
    }
}
