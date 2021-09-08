package exam1;

public class Main1 {

	public static void main(String[] args) {
		
		Clock clock = new Clock("7");
		Doctor doctor = new Doctor(clock);
		Nerd nerd = new Nerd(clock);
		Dev dev = new Dev(clock);
		
		System.out.println(doctor.state);
		System.out.println(nerd.state);
		System.out.println(dev.state);
		
		//�ð��� ���Ͽ� ���� 9�ø� �� state�� �ǻ�� �߱�, �����ڴ� ���,����� ��󸶷� �ڵ����� �ؾ��Ѵٸ�?
	}

}

	class Clock{
		private String time;
		
		public void setTime(String time) {
			this.time = time;
		}
		
		Clock(String time){
			this.time = time;
		}
		
	}
	
	class Doctor{
		Clock clock;
		String state="����";
		Doctor(Clock clock){
			this.clock = clock;
		}
	}
	class Nerd{
		Clock clock;
		String state="����";
		Nerd(Clock clock){
			this.clock = clock;
		}
	}
	class Dev{
		Clock clock;
		String state="����";
		Dev(Clock clock){
			this.clock = clock;
		}
	}