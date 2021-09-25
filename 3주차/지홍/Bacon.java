package study;

public class Bacon extends Decorater {

	public Bacon(Burger burger) {
		// TODO Auto-generated constructor stub
		this.burger = burger;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return burger.getDescription()+",베이컨 추가";
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
