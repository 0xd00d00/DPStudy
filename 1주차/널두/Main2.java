/*package example;

import java.io.IOException;

class Edit {
	public String data;
	public String getData()  throws IOException {
		// 처음 데이터 지우고;
		data = "";
		
		while (true) {
			// getch() 역할
			char c =  (char) System.in.read();
			
			if ( c == 10) break;
			
			if (Character.isDigit(c)) {
				//System.out.println(c);
				data += c;
			}
			
		}
		
		return data;
	}
}


class Main2 {
	public static void main(String[] args) throws IOException  {
		// getch()와 비슷 
		Edit e = new Edit();
		while(true) {
			String s = e.getData();
			System.out.println(s);
		}
	}
}*/