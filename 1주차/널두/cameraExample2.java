/*
package camera;

class Camera {
	void take() {
		System.out.println("take a picture with camera");
	}
}


class HDCamera {
	void take() {
		System.out.println("take a picture with HDcamera");
	}
}


class Person {
	Camera cam= null;
	HDCamera hdcam= null;
	
	public void buyTheCamera(Camera c) {
		this.cam = c;
	}
	public void buyTheHDCamera(HDCamera c) {
		this.hdcam = c;
	}
	public void takeAPicture() {
		if (cam != null)
			cam.take();
	}
	public void takeAHDPicture() {
		if (hdcam != null)
			hdcam.take();
	}
}
// OCP 위

public class cameraExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체마을의 한 사람.
		Person p = new Person();
		p.buyTheCamera(new Camera());
		p.takeAPicture();
		
		// 세월이 흘러.. 
		// 새로운 HD 카메라가 나왔다.
		p.buyTheHDCamera(new HDCamera());
		p.takeAHDPicture();

	}

}*/
