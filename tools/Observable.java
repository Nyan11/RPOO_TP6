package TP6v2.tools;

public interface Observable {
	void register(Observer o);
	void unregister(Observer o);
	void notifyObservers();
	void notifyObservers( Object arg);
}
