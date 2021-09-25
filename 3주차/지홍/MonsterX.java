package study;

public class MonsterX extends Burger{

	public MonsterX() {
		description ="몬스터 X버거";
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 8000;
	}

	@Override
	public double calorie() {
		// TODO Auto-generated method stub
		return 800;
	}

}
