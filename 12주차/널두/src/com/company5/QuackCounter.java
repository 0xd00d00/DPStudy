package com.company5;

public class QuackCounter implements Quackable {
    Quackable duck;
    // 모든 오리들을 횟수를 세기 위함. 별개로 세고 싶다면, static 사용 안해도 됨.
    static int numberOfQuacks;

    public QuackCounter( Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    // static 으로 반환해야하나?
    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
