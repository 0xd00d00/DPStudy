package com.company;

public class Main {

    public static void main(String[] args) {
        // pizza store 를 사람이 방문
        SimpleFactoryPattern sf = new SimpleFactoryPattern();
        PizzaStore ps = new PizzaStore(sf);
        ps.orderPizza("Busan");
    }
}
