package TP6v2.tools;

public interface Observer {
	void updateFrom (Observable o);
	void updateFrom (Observable o, Object arg);
}
