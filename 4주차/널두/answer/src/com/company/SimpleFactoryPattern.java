package com.company;

public class SimpleFactoryPattern {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Busan")) {
            pizza = new BusanStylePizza();
        } else {
            // cheese pizza;
        }
        return pizza;
    }
}
