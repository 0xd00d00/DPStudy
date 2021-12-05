package com.company5;

import java.util.ArrayList;
import java.util.Iterator;

public class Observerable implements QuackObserverable{
    ArrayList observers = new ArrayList();
    QuackObserverable duck;

    public Observerable(QuackObserverable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
