package sk.kosickaakademia.lenart.pattern.observes;

import sk.kosickaakademia.lenart.pattern.Tasr;

public class EmailServer extends Observer {
    public EmailServer(Tasr subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Sprava znie: "+subject.getMessage());
    }
}
