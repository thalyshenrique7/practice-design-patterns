package observerPattern.models;

import observerPattern.interfaces.Observer;
import observerPattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private String state;
    private List<Observer> observers;

    public ConcreteSubject(){
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
