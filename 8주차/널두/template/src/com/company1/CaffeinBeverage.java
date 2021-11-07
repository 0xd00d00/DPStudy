package com.company1;

public abstract class CaffeinBeverage {
    // final 선언 이유.. -> 내부적 변경 불가능
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments())
            addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    boolean customerWantCondiments() {
        return true;
    }
}
