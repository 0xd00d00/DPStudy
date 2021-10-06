package Speaker;

public class Main {

	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		//디버그 시 speaker1, speaker2 객체의 주소값이 똑같은 것을 알수 있다.
		
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		
		speaker1.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
	}

}
