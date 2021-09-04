package camera;

interface ICamera {
	public void take();
}

class Camera implements ICamera{
	public void take() {
		System.out.println("take a picture with camera");
	}
}


class HDCamera implements ICamera {
	public void take() {
		System.out.println("take a picture with HDcamera");
	}
}


class Person {
	ICamera cam;
	
	public void buyTheCamera(ICamera c) {
		this.cam = c;
	}

	public void takeAPicture() {
		if (cam != null)
			cam.take();
	}
}


public class cameraExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체마을의 한 사람.
		Person p = new Person();
		p.buyTheCamera(new Camera());
		p.takeAPicture();
		
		// 세월이 흘러.. 
		// 새로운 HD 카메라가 나왔다.
		p.buyTheCamera(new HDCamera());
		p.takeAPicture();

	}

}
