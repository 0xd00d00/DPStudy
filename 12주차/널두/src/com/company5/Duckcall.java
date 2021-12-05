package com.company5;

// 사냥꾼을 쫓기 위함.
public class Duckcall implements Quackable {
    Observerable observerable;

    public Duckcall() {
        observerable = new Observerable(this);
    }

    @Override
    public void quack() {
        System.out.println("kwak");
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
