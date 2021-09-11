package app;
public class App {
    public static void main(String[] args) {
		
		Clock clock = new Clock();

        Doctor doctor = new Doctor(clock);
		Nerd nerd = new Nerd(clock);
		Developer dev = new Developer(clock);
        clock.registerObserver(doctor);
        clock.registerObserver(nerd);
        clock.registerObserver(dev);

        clock.setTime(7);
		
		System.out.println(doctor.getJob()+" : " + doctor.getState());
        System.out.println(nerd.getJob()+" : " + nerd.getState());
        System.out.println(dev.getJob()+" : " + dev.getState());
		
		//시간이 변하여 만약 9시면 각 state를 의사는 야근, 개발자는 퇴근,백수는 드라마로 자동갱신 해야한다면?
        System.out.println("시간이 9시로 변했다..!");
        clock.setTime(9);
        System.out.println(doctor.getJob()+" : " + doctor.getState());
        System.out.println(nerd.getJob()+" : " + nerd.getState());
        System.out.println(dev.getJob()+" : " + dev.getState());
	}
}







