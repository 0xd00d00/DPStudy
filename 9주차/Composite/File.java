package Composite;

public class File implements Node{
	private String name;
	

	public File(String name) {
		this.name = name;
	
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name+".file";
	}


}
