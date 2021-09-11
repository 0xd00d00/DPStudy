package app;
import java.util.*;

public class Clock implements Subject{
    private List<Observer> observers;
    private int time;
    
    public Clock(){
        observers = new ArrayList<Observer>();
    }

    public void setTime(int time) {
        this.time = time;
        notifyObservers();
    }

    public int getTime(){
        return time;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
			observer.update(time);
		}
    }
    
}