/*package example;

import java.io.IOException;
import java.util.Scanner;

class Edit {
	public String data;
	public String getData()  throws IOException {
		// 처음 데이터 지우고;
		data = "";
		
		// getch() 역할
		Scanner scan = new Scanner(System.in);
		String str;
					
		str = scan.nextLine();
		System.out.println(str);
					
		data = str;
		
		return data;
	}
}


class Main {
	public static void main(String[] args) throws IOException  {
		// getch()와 비슷 
		Edit e = new Edit();
		while(true) {
			String s = e.getData();
			System.out.println(s);
		}
	}
}*/