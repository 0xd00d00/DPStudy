package com.company1;

import com.company1.CaffeinBeverage;

public class TeaBeverage extends CaffeinBeverage {
    @Override
    void brew() {
        System.out.println("차 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
