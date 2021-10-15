package exercise.simpleremote;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = 
		    new GarageDoorOpenCommand(garageDoor);
 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();



		// 리모컨의 기능을 확장해봅시다!
		// 버튼을 누를때 커튼을 올리고,
		// 다시 버튼을 누를때 커튼을 내려봅시다~!
		// (앞의 remote 사용법을 참고하세요.)
    }
	
}
