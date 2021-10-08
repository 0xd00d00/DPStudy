package Printer;

public class Client {

	public static void main(String[] args) {
		
		//1.Singleton Class인 Printer와 사용자클래스 User를 만들기
		//2.Printer 클래스를 싱글턴 방식으로 구현하고, sysout기능인 print()함수 만들기
		//3.문자열을 인자로 사용하며 Printer의 인스턴스를 받아오게 하는 User생성자를 만들기
		//4.User.print() 했을 때, User의 이름, print using, 주소값 을 출력하기
		
		User minsoo = new User("minsoo");
		minsoo.print();
		
		User chulsoo = new User("chulsoo");
		chulsoo.print();
		
		User younghee = new User("younghee");
		younghee.print();
		
		
	}
}
