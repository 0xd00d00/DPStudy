package sub2;

public class SimpleFactoryPattern {
    public static Pizza createPizza(String pizzaName){
        Pizza pizza = null;
        if (pizzaName.equals("Busan")) {
            pizza = new BusanStylePizza();
        } else if(pizzaName.equals("Incheon")){
            pizza = new IncheonStylePizza();
        } 
        return pizza;
    }
}
