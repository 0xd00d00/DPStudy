import java.io.IOException;



interface Validator {
	public boolean validate (String s, char c);
	public boolean iscomplete(String s);
}
// 1. 위의 인터페이스를 참조해 유효한 숫자를 읽어내는 validator 클래스를 구현해라

class NumberValidator implements Validator{
	@Override
    public boolean validate(String s, char c) {
        return Character.isDigit(c);
    }

    @Override
    public boolean iscomplete(String s) {
        return false;
    }
}

class Edit {
	public String data;
	private Validator validator;
	public void setValidator(Validator validator){
		this.validator = validator;
	}
	public String getData()  throws IOException {
		/*
		 * 1. 메소드를 추가해, 해당 메소드를 override해 변경해보라.
		*/
		data = "";
		
		while (true) {
			// getch() 역할
			char c =  (char) System.in.read();
			
			if ( c == 10) break;

            // 2. 구현한 클래스를 이용하여, 아래 주석처리된 부분을 적절히 변경해라.
            // if (Character.isDigit(c)) {
			// 	//System.out.println(c);
			// 	data += c;
			// }

            // 나의 변경.
			if (validator.validate(data, c)) {
				//System.out.println(c);
				data += c;
			}
            // .
			
		}
		
		return data;
	}
}
public class App {
    public static void main(String[] args) throws Exception {
        Edit e = new Edit();
		e.setValidator(new NumberValidator());
		while(true) {
			String s = e.getData();
			System.out.println(s);
		}
    }
}
