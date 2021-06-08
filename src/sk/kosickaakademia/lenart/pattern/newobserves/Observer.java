package sk.kosickaakademia.lenart.pattern.newobserves;

import sk.kosickaakademia.lenart.pattern.newobserves.Subject;

public abstract class Observer {
    public abstract void setSubject(Subject sub);
    public abstract void update();
}
