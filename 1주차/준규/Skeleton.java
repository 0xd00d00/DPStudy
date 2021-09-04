package behavioral.strategy;

import java.io.IOException;
import java.util.Scanner;

// 2. 아래의 인터페이스를 참조해 구현해라
interface Validator {
	boolean validate(String s, char c);
	boolean isComplete(String s);
}

class DigitValidator implements Validator {

    @Override
    public boolean validate(String s, char c) {
        return Character.isDigit(c);
    }

    @Override
    public boolean isComplete(String s) {
        return false;
    }
}

class Edit {
    private Validator validator;
	public String data;

	public void setValidator(Validator validator){
	    this.validator = validator;
    }

	public String getData()  throws IOException {

	    //1. 메소드를 추가해, 해당 메소드를 override해 변경해보라.
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

public class Skeleton {
	public static void main(String[] args) throws IOException  {
		// getch()와 비슷
		Edit e = new Edit();
		e.setValidator(new DigitValidator());
		while(true) {
			String s = e.getData();
			System.out.println(s);
		}
	}
}
