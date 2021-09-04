package example;

import java.io.IOException;

// 변하지 않는 부분과 변하는 부분을 분리해라.
/*
interface Validator {
	public boolean validate (String s, char c);
	public boolean iscomplete(String s);
}*/
//둘중 어떤걸 사용해도 됨
abstract class Validator {
	public abstract boolean validate (String s, char c);
	public boolean iscomplete(String s) {
		return true;
	}
}

class LimitDigitValidator extends Validator {
	public LimitDigitValidator(int n) { value = n; }
	public boolean validate (String s, char c) {
		return s.length() < this.value && Character.isDigit(c); 
	}
	
	public boolean iscomplete(String s) {
		return s.length() == value;
	}
	
	private int value;
}

class Edit {
	public String data;
	private Validator pVal = null;
	
	public void setValidator(Validator p) {
		this.pVal = p;
	}
	
	public String getData()  throws IOException {
		// 처음 데이터 지우고;
		data = "";
		
		while (true) {
			// getch() 역할
			char c =  (char)System.in.read();
			
			if ( c == 10 && (pVal == null || pVal.iscomplete(data))) break;
			
			if (pVal == null || pVal.validate(data, c)) {
				data += c;
			}
			
			// 이 부분이 변하는 부분
			/*
			if (Character.isDigit(c)) {
				//System.out.println(c - 48);
				data += (c - 48);
			}
			*/
		}
		
		return data;
	}
}


class Main4 {
	public static void main(String[] args) throws IOException  {
		// getch()와 비슷 
		Edit e = new Edit();
		e.setValidator(new LimitDigitValidator(5));
		while(true) {
			String s = e.getData();
			System.out.println(s);
		}
	}
}

