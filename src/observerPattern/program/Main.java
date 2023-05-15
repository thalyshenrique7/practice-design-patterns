package observerPattern.program;

import observerPattern.interfaces.Observer;
import observerPattern.models.ConcreteObserver;
import observerPattern.models.ConcreteSubject;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        ConcreteSubject concreteSubject = new ConcreteSubject();

        concreteSubject.addObserver(observer1);
        concreteSubject.addObserver(observer2);
        concreteSubject.setState("Update status has successfully");

        concreteSubject.notifyObservers();
    }
}
