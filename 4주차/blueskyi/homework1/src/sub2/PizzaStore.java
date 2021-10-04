package sub2;

public class PizzaStore {
    public  Pizza orderPizza(String type) {
        Pizza pizza = null;


        pizza = SimpleFactoryPattern.createPizza(type);


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
