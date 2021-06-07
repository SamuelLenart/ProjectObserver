package sk.kosickaakademia.lenart.pattern.observes;

import sk.kosickaakademia.lenart.pattern.Tasr;
import sk.kosickaakademia.lenart.pattern.observes.Observer;

public class SMSserver extends Observer {


    public SMSserver(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update(){
        System.out.println( "SMS: " + subject.getMessage());
    }
}
