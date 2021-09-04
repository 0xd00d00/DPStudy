package Skeleton;

import java.io.IOException;

public class Skeleton {
	public static void main(String[] args) throws IOException  {
		// getch()�� ��� 
		Edit e = new Edit();
		//e.setValidator(new ValidatorImpl());	//���ڸ� ���� ������
		//e.setValidator(new ValidatorImpl2());	//���ڸ� ���� �� ����
		e.setValidator(new ValidatorImpl3());	//�Ѵ� ���� �� ����
		
		while(true) {
			String s = e.getData();
			System.out.println(s);
		}
		
	}
}

//2. �Ʒ��� �������̽��� ������ �����ض�

 interface Validator {
	public boolean validate (String s, char c);
	public boolean iscomplete(String s);
}
 
 class ValidatorImpl implements Validator{
	 
	 //����
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
	 
	 //����
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
	 
	 //���� + ����
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
		
		//  1. �޼ҵ带 �߰���, �ش� �޼ҵ带 override�� �����غ���.
		  
		data = "";
		
		while (true) {
			// getch() ����
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

 

