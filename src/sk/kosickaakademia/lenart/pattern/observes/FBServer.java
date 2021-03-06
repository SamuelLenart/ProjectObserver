package sk.kosickaakademia.lenart.pattern.observes;


public class FBServer extends Observer {
    public FBServer(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("FB: "+subject.getMessage());
    }
    public void remove(){
        subject.remove(this);
    }
}
