package exam2;
import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main2 {

	public static void main(String[] args) {

		//Subject ��ü ����
		Clock clock = new Clock("7");//������ list ����
		
	    Doctor doctor = new Doctor(clock);//������ ��ü�� �߰�
	    Dev dev 	= new Dev(clock);
	    Nerd nerd 	= new Nerd(clock);

	    System.out.println("7��");
	    System.out.println(doctor.state);
	    System.out.println(dev.state);
	    System.out.println(nerd.state);
	    System.out.println();
	    
	    
		/*
		 * �ð��� 9�÷� ����Ǹ�?
		 */
	    System.out.println("9�÷� ����");
	    clock.setTime("9");
	    System.out.println(doctor.state);
	    System.out.println(dev.state);
	    System.out.println(nerd.state);
	    System.out.println();
	    
	    /*
	     * �ǻ� ������ ������?
	     */
	    System.out.println("�ǻ� ������ ���� ��");
	    doctor.delName(); //������ ����
	    
	    System.out.println(doctor.state);
	    System.out.println(dev.state);
	    System.out.println(nerd.state);
		
	    /*
	    subject = ���ϴ� ����� �������̽�
	    object = ��ü�� ��ȭ�� �˸� ��ȭ ������ �������̽�
	    concreteSubject = ���� ���ϴ� ���, ������ ����, ���������� �뺸
	    concreteObject = ������, ������Ʈ�κ��� ���޹޾� ������ ����, �˸� ó��
	    */
	}

}

/*
 * ������ ���� : ��ü�� ���°� ����� ������ 
 * ����� ��ü���� �˸��� ���� �Ѵ�.(�̺�Ʈ �߻� �� �ﰢ������ ó��!) 

 * Subject(Publisher) 	- ��ȭ�ϴ� ��. 	���ô��� ���
 * Observer 			- ��ȭ�� �����ϴ� ��. �����ϴ� ��ü (������ ��� �޾Ƴ��´�. �� Subject�� ��ȭ�� ���ø� �ϰڴٴ� ��.)
 */
interface Subject{//��ȭ ���, ��ȭ ó���� �޼��带 �������´�
	void registerObserver(Observer observer); 	//������ ���� ���
    void unregisterObserver(Observer observer); //������ ���� ���
    void notifyObservers(); 					//�뺸 ���
}

interface Observer{//�����ϴ� ��
	void delName(); //������ ����
	void update(); //���� ��ȭ �� 
}

class Clock implements Subject{ //��ȭ ����� �ð��̴�. �ð��� Subject�� �����ΰ� �ȴ�
		public ArrayList<Observer> observerCollection; //�뺸����� ���� ����Ʈ�� ����
	    public String time;
	
	    public Clock(String time) {
	        observerCollection = new ArrayList<>();
	        this.time = time;
	    }
	
	    @Override
	    public void registerObserver(Observer observer) {
	        observerCollection.add(observer);
	    }
	
	    @Override
	    public void unregisterObserver(Observer observer) {
	        observerCollection.remove(observer);
	    }
	
	    @Override
	    public void notifyObservers() {//�ݺ������� ����Ʈ �ȿ� �ִ� ��� ����ڿ��� �뺸�Ѵ�.
	        for(Observer observer:observerCollection){
	            observer.update();
	            System.out.println("��ȭ ���� : �����ڿ��� �뺸");
	        }
	    }
	
	    public void setTime(String time) {
	        this.time = time;
	        notifyObservers();//�ð��� �ٲ� ���� �뺸

	    }
		
	}

class Doctor implements Observer{
    public Clock clock;
    public String state;

    public Doctor(Clock clock) {
    	this.state ="����";
        this.clock = clock;
        this.clock.registerObserver(this);
    }

    @Override
    public void update() {
        //action!
        {
            if (clock.time.equals("9")) {
                state = "�߱�";
            }
        }
    }

	@Override
	public void delName() {
		// TODO Auto-generated method stub
	this.clock.unregisterObserver(this);
	this.state="";
	clock.setTime(clock.time);
	}
	
}

class Dev implements Observer{
    public Clock clock;
    public String state;

    public Dev(Clock clock) {
    	this.state ="����";
        this.clock = clock;
        this.clock.registerObserver(this);
    }
	@Override
	public void delName() {
		// TODO Auto-generated method stub
		  this.clock.unregisterObserver(this);
		  this.state="";
		  clock.setTime(clock.time);
		  
	}

    @Override
    public void update() {
        //action!
        {
            if (clock.time.equals("9")) {
                state = "���";
            }
        }
    }
    
  
	
}
  class Nerd implements Observer{
	    public Clock clock;
	    public String state;
	  
	    public Nerd(Clock clock) {
	    	this.state ="����";
	        this.clock = clock;
	        this.clock.registerObserver(this);
	    }
		@Override
		public void delName() {
			// TODO Auto-generated method stub
			  this.clock.unregisterObserver(this);
			  this.state="";
			  clock.setTime(clock.time);
		}

	    @Override
	    public void update() {
	        //action!
	        {
	            if (clock.time.equals("9")) {
	                state = "���";
	            }
	        }
	    }
  }



