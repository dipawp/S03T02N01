package exercici1;

import java.util.ArrayList;
import java.util.List;

public class ObersvableAgent {
	private float actualIbex35 = 8850; 
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void updateIbex35(float variation) {
		this.actualIbex35 += variation; 
		for(Observer observer: this.observers) {
			observer.notifica(this.actualIbex35);
		}
	}
}