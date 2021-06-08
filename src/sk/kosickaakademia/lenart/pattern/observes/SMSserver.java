package sk.kosickaakademia.lenart.pattern.observes;

public class SMSserver extends Observer {


    public SMSserver(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update(){
        System.out.println( "SMS: " + subject.getMessage());
    }
    public void remove(){
        subject.remove(this);
    }
}
