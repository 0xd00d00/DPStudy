package Composite;

public class Main {
	public static void main(String[] args) {
		
		//�����ȿ� ���ϰ� ���� ����
		Directory dir = new Directory("��������");
		dir.add(new File("����1"));
		dir.add(new Directory("����2"));
		dir.add(new File("����2"));
		/*
		 * Directory dir2 = new Directory("��������2"); dir2.add(new File("����3"));
		 * dir2.add(new Directory("����3")); dir2.add(new File("����4"));
		 * 
		 * dir.add(dir2);
		 */
		
		System.out.println(dir.getName());
		
		//�����ȿ� �����ְ� ���ϳֱ�
		Directory dir3 = new Directory("��������1");
		Directory dir4 = new Directory("����3");
		File f1 = new File("����3");
		dir3.add(dir4);
		dir4.add(f1);

		System.out.println(dir3.getName());

	}

}
