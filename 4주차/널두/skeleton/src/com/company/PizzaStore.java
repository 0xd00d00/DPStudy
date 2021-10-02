package com.company;

public class PizzaStore {
    public  Pizza orderPizza(String type) {
        Pizza pizza = null;


				/*
				 * !!!!!! 주목 !!!!!!!
				 * 이 부분이 OCP를 위반한다
				 * */
        if (type.equals("Busan")) {
            pizza = new BusanStylePizza();
        } else {
            // cheese pizza;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
