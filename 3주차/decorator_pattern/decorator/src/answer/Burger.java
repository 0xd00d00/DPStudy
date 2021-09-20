package answer;

public abstract class Burger {
    String description = "burger";
  
	public String getDescription() {
		return description;
	}
 
    // 단위 원.
	public abstract double cost();

    // 단위 kcal.
    public abstract double calorie();
}
