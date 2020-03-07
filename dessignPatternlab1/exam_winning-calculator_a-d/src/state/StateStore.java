package state;

import java.util.*;
import patternDessign.*;


public class StateStore implements IObservable {
	private static StateStore instance;
	private State currentState;
	private Reducer<State> reducer;
	private ArrayList<IObserver> observers;

	private StateStore() {
		this.currentState = new State();
		this.reducer = new PoorReducer();
		this.observers = new ArrayList<IObserver>();
	}

	public void updateInValues(String action, int value) {
		this.currentState = reducer.reduce(currentState, action, value);     
		this.notifyObserver();
	}

	public State getState() {
		return this.currentState;
	}

	public static synchronized StateStore getInstance() {
		if (StateStore.instance == null) {
			StateStore.instance = new StateStore();
		}
		return StateStore.instance;
	}

	@Override 
	public void notifyObserver() {
		if(!this.observers.isEmpty()) {
			for(IObserver observer : observers) {
				observer.update();
			}
		}
	}

	@Override     // KILLING LIS?
	public void register(IObserver observer) {
		if(!(observer instanceof IObserver)){
			throw new ClassCastException();
		}
		else {
			this.observers.add(observer);		
		}
	}
}
