package sk.kosickaakademia.lenart.pattern.observes;

import sk.kosickaakademia.lenart.pattern.Tasr;

public class FaxServer extends Observer {
    public FaxServer(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Sprava znie: "+subject.getMessage());
    }
}
