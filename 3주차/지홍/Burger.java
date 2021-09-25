package study;

public abstract class Burger {

	String description = "none desc";
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
	public abstract double calorie();
	
}
