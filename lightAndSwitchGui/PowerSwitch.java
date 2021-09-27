package TP6v2.lightAndSwitchGui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashSet;
import java.util.Set;

import TP6v2.tools.Observable;
import TP6v2.tools.Observer;
import TP6v2.nicellipse.component.NiRectangle;

public class PowerSwitch extends NiRectangle implements MouseListener, Observable {
	protected boolean closed = false;
	private Set<Observer> observers;
	
	public PowerSwitch() {
		super();
		this.setBackground(Color.GREEN);
		addMouseListener(this);
		this.observers = new HashSet<Observer>();
	}
	
	public boolean isClosed() {
		return closed;
	}
	
	public void switchState() {
		closed = ! closed;
	}
	
	public Color defaultColor() {
		return Color.green;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.switchState();
		this.notifyObservers(this.closed);
		e.consume();
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void register(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		this.observers.forEach(o -> o.updateFrom(this));
	}

	@Override
	public void notifyObservers(Object arg) {
		this.observers.forEach(o -> o.updateFrom(this, arg));
	}


}
