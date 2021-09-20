package answer;

public class Cheeze extends ToppingDecorator {

    public Cheeze(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + "+ cheeze";
    }

    @Override
    public double cost() {
        return 200 + burger.cost();
    }

    @Override
    public double calorie() {
        // TODO Auto-generated method stub
        return 50 + burger.calorie();
    }
    
}
