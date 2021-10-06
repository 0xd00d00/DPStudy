package Printer;

public class Printer {
	//외부에 제공할 자기 자신의 인스턴스
	private static Printer printer = null;
	private Printer() {}
	//자기 자신의 인스턴스를 외부에 제공
	
	public static Printer getPrinter() {
		if(printer==null) {
			//printer 인스턴스 생성
			printer = new Printer();
		}
		return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
