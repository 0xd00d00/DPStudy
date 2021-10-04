package myanswer;

public class IncheonPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Incheon")) {
            pizza = new IncheonStylePizza();
        } else {
            // cheese pizza;
        }
        return pizza;
    }   
}
