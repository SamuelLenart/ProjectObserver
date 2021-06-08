package sk.kosickaakademia.lenart.pattern.observes;

public class FaxServer extends Observer {
    public FaxServer(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("FAX: "+subject.getMessage());
    }
    public void remove(){
        subject.remove(this);
    }
}
