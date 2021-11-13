package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Node{

	private String name;
	private List<Node> children = new ArrayList<Node>();
	
	public Directory(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub		
		
		
		for (Node node : children) {
			System.out.print(node.getName() + "/");
		}
		
		/* 
		for (int i = 0; i < children.size(); i++) {
			
		System.out.print(children.get(i).getName()+"/");
			
		}
		*/
		return name+".dir";
	}
	
	public void add(Node node) {
		children.add(node);
	}

	

}
