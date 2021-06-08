package sk.kosickaakademia.lenart.pattern.observes;

public class Main {
    public static void main(String[] args) {
        Tasr subject = new Tasr();
        new EmailServer(subject);
        new SMSserver(subject);
        new FBServer(subject);
        new FaxServer(subject);

        subject.setMessage("Kanada je majster sveta", 2);

        subject.setMessage("Message", 1);
        FaxServer.remove();
        SMSserver.remove();
        subject.setMessage("Message 2", 2);
        FaxServer.remove();
        SMSserver.remove();
        FBServer.remove();
        subject.setMessage("Message 3", 3);
    }
}

