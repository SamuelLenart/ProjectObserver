package sk.kosickaakademia.lenart.pattern.observes;

import sk.kosickaakademia.lenart.pattern.observes.Observer;

import java.util.ArrayList;
import java.util.List;

public class Tasr {
    private List<Observer> observers = new ArrayList<>();
    private String message;
    private int priority;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message, int i){
        this.message = message;
        notifyAllObservers();
    }

    private void notifyAllObservers(){
        for (sk.kosickaakademia.lenart.pattern.observes.Observer observer : observers) {
            observer.update();
        }
    }
    public void attach(sk.kosickaakademia.lenart.pattern.observes.Observer observer){
        observers.add(observer);
    }
    public void remove(Observer observer){
        observers.remove(observer);
    }

    public int getPriority() {
        return priority;
    }
}
