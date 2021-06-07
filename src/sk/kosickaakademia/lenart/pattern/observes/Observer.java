package sk.kosickaakademia.lenart.pattern.observes;

import sk.kosickaakademia.lenart.pattern.Tasr;

public abstract class Observer {
    protected Tasr subject;
    public abstract void update();
}
