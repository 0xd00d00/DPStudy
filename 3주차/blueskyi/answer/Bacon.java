package answer;

public class Bacon extends ToppingDecorator{

    public Bacon(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + "+ bacon";
    }

    @Override
    public double cost() {
        return 500 +  burger.cost();
    }

    @Override
    public double calorie() {
        return 100 + burger.calorie();
    }
    
}
