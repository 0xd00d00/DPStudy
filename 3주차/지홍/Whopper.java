package study;

public class Whopper extends Burger {

	public Whopper() {
		description = "���� ����";
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
