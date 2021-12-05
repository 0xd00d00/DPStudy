package com.company5;

// 고무 오리
public class RubberDuck implements Quackable {
    Observerable observerable;
    public RubberDuck() {
        observerable = new Observerable(this);
    }
    @Override
    public void quack() {
        System.out.println("Squeak");
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
