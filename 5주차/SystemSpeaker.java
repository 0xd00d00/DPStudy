package Speaker;

public class SystemSpeaker {

	private static SystemSpeaker instance; //자기자신 클래스의 인스턴스
	private int volume; 
	
	public static SystemSpeaker getInstance() { //하나의 객체를 생성 및 할당해주는 스태틱 메서드
		if(instance==null) {
			instance = new SystemSpeaker();//null일경우 새로운 익명객체를 생성해준다.
			System.out.println("새로 생성되는 인스턴스");
		}else {
			System.out.println("이미 생성된 인스턴스");
		}
		
		return instance;
	}

	private SystemSpeaker() {//볼륨 기본 값
		 this.volume = 5;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	
}
