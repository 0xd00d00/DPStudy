package study;

public class Whopper extends Burger {

	public Whopper() {
		description = "와퍼 버거";
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 6000;
	}

	@Override
	public double calorie() {
		// TODO Auto-generated method stub
		return 500;
	}

}
