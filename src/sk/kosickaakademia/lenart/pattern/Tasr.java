package sk.kosickaakademia.lenart.pattern;

import sk.kosickaakademia.lenart.pattern.observes.Observer;

import java.util.ArrayList;
import java.util.List;

public class Tasr {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
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
}
