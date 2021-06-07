package sk.kosickaakademia.lenart.pattern;

import sk.kosickaakademia.lenart.pattern.observes.EmailServer;
import sk.kosickaakademia.lenart.pattern.observes.FBServer;
import sk.kosickaakademia.lenart.pattern.observes.FaxServer;
import sk.kosickaakademia.lenart.pattern.observes.SMSserver;

public class Main {
    public static void main(String[] args) {
        Tasr subject=new Tasr();
        new EmailServer(subject);
        new SMSserver(subject);
        new FBServer(subject);
        new FaxServer(subject);

        subject.setMessage("Kanada je majster sveta");
    }
}
