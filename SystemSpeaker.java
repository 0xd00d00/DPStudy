package Speaker;

public class SystemSpeaker {

	private static SystemSpeaker instance; //�ڱ��ڽ� Ŭ������ �ν��Ͻ�
	private int volume; 
	
	public static SystemSpeaker getInstance() { //�ϳ��� ��ü�� ���� �� �Ҵ����ִ� ����ƽ �޼���
		if(instance==null) {
			instance = new SystemSpeaker();//null�ϰ�� ���ο� �͸�ü�� �������ش�.
			System.out.println("���� �����Ǵ� �ν��Ͻ�");
		}else {
			System.out.println("�̹� ������ �ν��Ͻ�");
		}
		
		return instance;
	}

	private SystemSpeaker() {//���� �⺻ ��
		 this.volume = 5;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	
	
}
