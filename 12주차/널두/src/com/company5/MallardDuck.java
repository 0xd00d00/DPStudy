package com.company5;

// 우리가 흔히 아는 오리
public class MallardDuck implements Quackable {
    Observerable observerable;
    public MallardDuck() {
        observerable = new Observerable(this);
    }
    @Override
    public void quack() {
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
