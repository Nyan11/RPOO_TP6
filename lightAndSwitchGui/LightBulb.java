package TP6v2.lightAndSwitchGui;

import java.awt.Color;

import TP6v2.tools.Observable;
import TP6v2.tools.Observer;
import TP6v2.nicellipse.component.NiEllipse;

public class LightBulb extends NiEllipse implements Observer  {

	public LightBulb() { 
		super();
		this.setBackground(Color.WHITE);
	}

	@Override
	public void updateFrom(Observable o) {}

	@Override
	public void updateFrom(Observable o, Object arg) {
		this.setBackground(Boolean.valueOf((boolean) arg) ? Color.YELLOW : Color.WHITE);
	}

}
