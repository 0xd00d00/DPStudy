package study;

public class Cheeze extends Decorater {

	public Cheeze(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return burger.getDescription() + ",ġ���߰�";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return burger.cost() + 500;
	}

	@Override
	public double calorie() {
		// TODO Auto-generated method stub
		return burger.calorie() + 100;
	}

}
