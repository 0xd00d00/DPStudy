package answer;

public abstract class PizzaStore {

    /* SimpleFactory Pattern에 대해 문제를 생각해보자.
    *
    *  baking 하는 부분은 변경되면 안되고, 실제 변경이 필요한 부분은 만드는 부분임.
    * */

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
