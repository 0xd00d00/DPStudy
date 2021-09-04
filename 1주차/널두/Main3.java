/*
package example;

import java.io.IOException;

// 변하지 않는 부분과 변하는 부분을 분리해라.


class Edit {
	public String data;
	
	// 가상함수로 뺌. 변화가 필요한 부분 
	public boolean validate(char c) {
		return true;
	}
	
	public String getData()  throws IOException {
		// 처음 데이터 지우고;
		data = "";
		
		while (true) {
			// getch() 역할
			char c =  (char)System.in.read();
			
			if ( c == 10) break;
			
			// 이 부분이 변하는 부분
			/*
			if (Character.isDigit(c)) {
				//System.out.println(c - 48);
				data += (c - 48);
			}
			
			
			if (validate(c)) {
				System.out.println(c);
				data += c;
			}
			
		}
		
		return data;
	}
}

class AddressEdit extends Edit {
	// 이거 없어도 되는 것 같은데 관례로 붙여주는 것 같음.
	@Override
	public boolean validate(char c) {
		return Character.isDigit(c);
	}
}


class Main3 {
	public static void main(String[] args) throws IOException  {
		// getch()와 비슷 
		AddressEdit e = new AddressEdit();
		while(true) {
			String s = e.getData();
			System.out.println(s);
		}
	}
}
*/