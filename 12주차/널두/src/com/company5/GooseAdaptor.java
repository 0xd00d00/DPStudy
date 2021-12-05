package com.company5;

public class GooseAdaptor implements Quackable {
    Goose goose;
    Observerable observerable;

    public GooseAdaptor(Goose goose) {
        this.goose = goose;
        observerable = new Observerable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
