package com.company5;

public interface QuackObserverable {
    public void registerObserver (Observer observer);
    public void notifyObservers ();
}
