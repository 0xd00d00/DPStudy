package Printer;

public class Client {

	public static void main(String[] args) {
		
		//1.Singleton Class�� Printer�� �����Ŭ���� User�� �����
		//2.Printer Ŭ������ �̱��� ������� �����ϰ�, sysout����� print()�Լ� �����
		//3.���ڿ��� ���ڷ� ����ϸ� Printer�� �ν��Ͻ��� �޾ƿ��� �ϴ� User�����ڸ� �����
		//4.User.print() ���� ��, User�� �̸�, print using, �ּҰ� �� ����ϱ�
		
		User minsoo = new User("minsoo");
		minsoo.print();
		
		User chulsoo = new User("chulsoo");
		chulsoo.print();
		
		User younghee = new User("younghee");
		younghee.print();
		
		
	}
}
