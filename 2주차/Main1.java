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
		
		//시간이 변하여 만약 9시면 각 state를 의사는 야근, 개발자는 퇴근,백수는 드라마로 자동갱신 해야한다면?
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
		String state="보통";
		Doctor(Clock clock){
			this.clock = clock;
		}
	}
	class Nerd{
		Clock clock;
		String state="보통";
		Nerd(Clock clock){
			this.clock = clock;
		}
	}
	class Dev{
		Clock clock;
		String state="보통";
		Dev(Clock clock){
			this.clock = clock;
		}
	}