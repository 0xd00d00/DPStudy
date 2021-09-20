package answer;
// public abstract class CondimentDecorator extends Beverage {
// 	Beverage beverage;
// 	public abstract String getDescription();
// }
public abstract class ToppingDecorator extends Burger {
    Burger burger;
    public abstract String getDescription();
}
