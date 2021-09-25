package study;

public abstract class Decorater extends Burger {

	Burger burger;
	public abstract String getDescription();
	public abstract double cost();
	public abstract double calorie();
	
}
