package com.company5;

public class Quackologist implements Observer{

    @Override
    public void update(QuackObserverable duck) {
        System.out.println("!!!!!");
        System.out.println("Quackologist " + duck.toString() + " just quacked ");
    }
}
