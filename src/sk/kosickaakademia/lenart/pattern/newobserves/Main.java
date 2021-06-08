package sk.kosickaakademia.lenart.pattern.newobserves;

public class Main {
    public static void main(String[] args) {
        MyACC topic = new MyACC();

        Observer obj1 = new Observer("Obj1") {
            @Override
            public void setSubject(Subject sub) {

            }

            @Override
            public void update() {

            }
        };
        Observer obj2 = new Observer("Obj2") {
            @Override
            public void setSubject(Subject sub) {

            }

            @Override
            public void update() {

            }
        };
        Observer obj3 = new Observer("Obj3") {
            @Override
            public void setSubject(Subject sub) {

            }

            @Override
            public void update() {

            }
        };

        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        obj1.update();

        topic.postMessage("New Message");
    }
}
