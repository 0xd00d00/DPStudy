package Printer;

public class Printer {
	//�ܺο� ������ �ڱ� �ڽ��� �ν��Ͻ�
	private static Printer printer = null;
	private Printer() {}
	//�ڱ� �ڽ��� �ν��Ͻ��� �ܺο� ����
	
	public static Printer getPrinter() {
		if(printer==null) {
			//printer �ν��Ͻ� ����
			printer = new Printer();
		}
		return printer;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
