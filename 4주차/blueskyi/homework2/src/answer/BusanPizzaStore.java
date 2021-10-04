package answer;

public class BusanPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Busan")) {
            pizza = new BusanStylePizza();
        } else {
            // cheese pizza;
        }
        return pizza;
    }
}
