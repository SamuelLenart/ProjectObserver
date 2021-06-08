package sk.kosickaakademia.lenart.pattern.observes;

public class EmailServer extends Observer {
    public EmailServer(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("EMAIL: "+subject.getMessage());
    }
    public void remove(){
        subject.remove(this);
    }
}
