package hf;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		System.out.println();
		weatherData.setMesurement(2, 3, 4);//����ȭ
		
		
		System.out.println();
		System.out.println(staticsDisplay.temp);
		System.out.println(currentConditionsDisplay.temp);
		System.out.println(forecastDisplay.temp);
		
		
		
		//weatherData.setMesurement(5, 6, 7);
		//weatherData.setMesurement(8, 8, 9);
		
		

	}

}


interface Subject{
	void registerObserver(Observer observer);
	void unregisterObserver(Observer observer);
	void notifyObserver();
	
	
}

interface Observer{
	void update(float temp,float humidity,float pressure);
	
}
interface DisplayElement{
	void display();
}

class WeatherData implements Subject{
	public Observer observer;
	ArrayList<Observer> observationList ; 
	float temp;
	float humidity;
	float pressure;
	public WeatherData() {
		observationList = new ArrayList<Observer>();
		//this.observationList.add(observer);
		// TODO Auto-generated constructor stub
	}
	
	public void setMesurement(float temp,float humidity,float pressure) {//�� �����ø��� ���������� �뺸
		this.humidity = humidity;
		this.temp = temp;
		this.pressure = pressure;
		mesurementsChanged();
				
	}
	public void mesurementsChanged() {
        notifyObserver();

	}

	 float getTemperature() {
		// TODO Auto-generated method stub
		return this.temp;
	}	
	float getPressure() {
		// TODO Auto-generated method stub
		return this.pressure;
	}

	float getHumidity() {
		// TODO Auto-generated method stub
		return this.humidity;
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observationList.add(observer);
		System.out.println("������ �߰�");
		
	}

	@Override
	public void unregisterObserver(Observer observer) {
		// TODO Auto-generated method stub
		observationList.remove(observer);
		System.out.println("������ ����");
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observationList.size(); i++) {
			observationList.get(i).update(this.temp,this.humidity,this.pressure);
			
			System.out.println("���������� �뺸");
		}
	
	}
}
class CurrentConditionsDisplay implements Observer,DisplayElement{
	public float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {//�����ڿ� ����if��ü����, �� ��ü�� ���÷��̸� �������� ���
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {

		System.out.println("��°� ������\n"+this.temp+"\n"+this.humidity);
		
	}
	@Override
	public void update(float temp, float humidity, float pressure) {//updateȣ��� �ڵ����� displayȣ��
		this.temp = temp;
		this.humidity = humidity;
		display();
		
	}
	
}


class ForecastDisplay implements Observer,DisplayElement{
	public Subject weatherData;
	float temp;
	float humidity;
	float pressure;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	

	@Override
	public void display() {
		System.out.println("������ �������� ���� �� �����ڽ��ϴ�.");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();// ��󿹺�
		
	}
	
}
class ThirdPartyDisplay implements Observer,DisplayElement{
	public Subject weatherData;
	float temp;
	float humidity;
	float pressure;
	
	@Override
	public void display() {
		//������ ���� �ٸ�����
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
		
	}
	
}

class StaticsDisplay implements Observer,DisplayElement{
	public Subject weatherData;
	float temp;
	float humidity;
	float pressure;
	public StaticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp,float humidity,float pressure) {//����
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
		
		
	}
	
	public void display() {//ǥ��
		//��� ���� �ְ�ġ ǥ��
		System.out.println("�µ� : "+this.temp);
		System.out.println("���� : "+this.humidity);
		System.out.println("��� : "+this.pressure);
		
	}

}
