package Skeleton;

import java.io.IOException;

public class Skeleton {
	public static void main(String[] args) throws IOException  {
		// getch()와 비슷 
		Edit e = new Edit();
		//e.setValidator(new ValidatorImpl());	//숫자만 받을 수있음
		//e.setValidator(new ValidatorImpl2());	//문자만 받을 수 있음
		e.setValidator(new ValidatorImpl3());	//둘다 받을 수 있음
		
		while(true) {
			String s = e.getData();
			System.out.println(s);
		}
		
	}
}

//2. 아래의 인터페이스를 참조해 구현해라

 interface Validator {
	public boolean validate (String s, char c);
	public boolean iscomplete(String s);
}
 
 class ValidatorImpl implements Validator{
	 
	 //숫자
	@Override
	public boolean validate(String s, char c) {
		// TODO Auto-generated method stub
		return Character.isDigit(c);
	}

	@Override
	public boolean iscomplete(String s) {
		// TODO Auto-generated method stub
		return false;
	}
	 
 }
 
class ValidatorImpl2 implements Validator{
	 
	 //문자
	@Override
	public boolean validate(String s, char c) {
		// TODO Auto-generated method stub
		return !Character.isDigit(c);
	}

	@Override
	public boolean iscomplete(String s) {
		// TODO Auto-generated method stub
		return false;
	}
	 
 }

class ValidatorImpl3 implements Validator{
	 
	 //문자 + 숫자
	@Override
	public boolean validate(String s, char c) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean iscomplete(String s) {
		// TODO Auto-generated method stub
		return false;
	}
	 
}
 
class Edit {
	private Validator validator;
	
	public void setValidator (Validator validator) {
		this.validator = validator;
	}
	
	public String data;
	public String getData()  throws IOException {
		
		//  1. 메소드를 추가해, 해당 메소드를 override해 변경해보라.
		  
		data = "";
		
		while (true) {
			// getch() 역할
			char c =  (char) System.in.read();
			
			if ( c == 10) break;
			
			if (validator.validate(data, c)) {
				//System.out.println(c);
				data += c;
			}
			
		}
		
		return data;
	}
}

 

