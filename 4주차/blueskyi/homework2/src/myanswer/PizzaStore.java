package myanswer;

/*
 * 해당 코드에서, SimpleFactory를 제거하고, abstract 클래스로 만들어라
 * cratePizza 부분을 추상 메소드로 분리하라
 * */
public abstract class PizzaStore {

    public  Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
