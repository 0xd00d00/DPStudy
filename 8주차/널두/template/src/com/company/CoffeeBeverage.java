package com.company;

public class CoffeeBeverage extends CaffeinBeverage{

    @Override
    void brew() {
        System.out.println("필터로 커피 우려낸 중..");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 커피 추가하는 중..");
    }
}
