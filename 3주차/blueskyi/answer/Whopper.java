package answer;

public class Whopper extends  Burger{
	public Whopper() {
		description = "와퍼";
	}
 
	// public double cost() {
	// 	return 1.05;
	// }
    @Override
    public double cost() {
        return 4000;
    }

    @Override
    public double calorie() {
        return 500;
    }
    
}
