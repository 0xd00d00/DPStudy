package com.company5;

public class RedheadDuck implements Quackable {
    Observerable observerable;

    public RedheadDuck() {
        observerable = new Observerable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observerable.notifyObservers();
    }
}
