package exam2;
import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main2 {

	public static void main(String[] args) {

		//Subject 객체 선언
		Clock clock = new Clock("7");//구독자 list 생성
		
	    Doctor doctor = new Doctor(clock);//구독자 객체로 추가
	    Dev dev 	= new Dev(clock);
	    Nerd nerd 	= new Nerd(clock);

	    System.out.println("7시");
	    System.out.println(doctor.state);
	    System.out.println(dev.state);
	    System.out.println(nerd.state);
	    System.out.println();
	    
	    
		/*
		 * 시간이 9시로 변경되면?
		 */
	    System.out.println("9시로 변경");
	    clock.setTime("9");
	    System.out.println(doctor.state);
	    System.out.println(dev.state);
	    System.out.println(nerd.state);
	    System.out.println();
	    
	    /*
	     * 의사 구독자 삭제시?
	     */
	    System.out.println("의사 구독자 삭제 시");
	    doctor.delName(); //구독자 삭제
	    
	    System.out.println(doctor.state);
	    System.out.println(dev.state);
	    System.out.println(nerd.state);
		
	    /*
	    subject = 변하는 대상의 인터페이스
	    object = 주체의 변화를 알릴 변화 감시자 인터페이스
	    concreteSubject = 실제 변하는 대상, 구독자 변경, 옵저버에게 통보
	    concreteObject = 구독자, 서브젝트로부터 전달받아 구독자 갱신, 알림 처리
	    */
	}

}

/*
 * 옵저버 패턴 : 주체의 상태가 변경될 때마다 
 * 연결된 객체에게 알림이 가야 한다.(이벤트 발생 시 즉각적으로 처리!) 

 * Subject(Publisher) 	- 변화하는 것. 	감시당할 대상
 * Observer 			- 변화를 감시하는 것. 감시하는 주체 (감시할 대상에 달아놓는다. 즉 Subject의 변화를 감시를 하겠다는 것.)
 */
interface Subject{//변화 대상, 변화 처리할 메서드를 만들어놓는다
	void registerObserver(Observer observer); 	//옵저버 생성 기능
    void unregisterObserver(Observer observer); //옵저버 삭제 기능
    void notifyObservers(); 					//통보 기능
}

interface Observer{//감시하는 것
	void delName(); //구독자 삭제
	void update(); //상태 변화 시 
}

class Clock implements Subject{ //변화 대상은 시간이다. 시간이 Subject의 구현부가 된다
		public ArrayList<Observer> observerCollection; //통보대상을 담을 리스트를 만듦
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
	    public void notifyObservers() {//반복문으로 리스트 안에 있는 모든 대상자에게 통보한다.
	        for(Observer observer:observerCollection){
	            observer.update();
	            System.out.println("변화 감지 : 구독자에게 통보");
	        }
	    }
	
	    public void setTime(String time) {
	        this.time = time;
	        notifyObservers();//시간이 바뀔때 마다 통보

	    }
		
	}

class Doctor implements Observer{
    public Clock clock;
    public String state;

    public Doctor(Clock clock) {
    	this.state ="보통";
        this.clock = clock;
        this.clock.registerObserver(this);
    }

    @Override
    public void update() {
        //action!
        {
            if (clock.time.equals("9")) {
                state = "야근";
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
    	this.state ="보통";
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
                state = "퇴근";
            }
        }
    }
    
  
	
}
  class Nerd implements Observer{
	    public Clock clock;
	    public String state;
	  
	    public Nerd(Clock clock) {
	    	this.state ="보통";
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
	                state = "드라마";
	            }
	        }
	    }
  }



