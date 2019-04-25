package task2;

import java.util.ArrayList;

public abstract class Observable implements IObservable {
	
    private final ArrayList<IObserver> observers = new ArrayList<>();
    
    protected void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
  
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
}
