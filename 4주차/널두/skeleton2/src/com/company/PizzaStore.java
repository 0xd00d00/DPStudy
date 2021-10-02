package com.company;

/*
 * 해당 코드에서, SimpleFactory를 제거하고, abstract 클래스로 만들어라
 * cratePizza 부분을 추상 메소드로 분리하라
 * */
public class PizzaStore {
    SimpleFactoryPattern sf = null;

    public PizzaStore(SimpleFactoryPattern fa) {
        sf = fa;
    }

    public  Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = sf.createPizza(type);

        /* Simple Factory pattern은 이친구를 뺴는 것*/


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
