package Composite;

public class Main {
	public static void main(String[] args) {
		
		//폴더안에 파일과 폴더 생성
		Directory dir = new Directory("원본폴더");
		dir.add(new File("파일1"));
		dir.add(new Directory("폴더2"));
		dir.add(new File("파일2"));
		/*
		 * Directory dir2 = new Directory("원본폴더2"); dir2.add(new File("파일3"));
		 * dir2.add(new Directory("폴더3")); dir2.add(new File("파일4"));
		 * 
		 * dir.add(dir2);
		 */
		
		System.out.println(dir.getName());
		
		//폴더안에 폴더넣고 파일넣기
		Directory dir3 = new Directory("원본폴더1");
		Directory dir4 = new Directory("폴더3");
		File f1 = new File("파일3");
		dir3.add(dir4);
		dir4.add(f1);

		System.out.println(dir3.getName());

	}

}
