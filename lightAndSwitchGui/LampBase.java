package TP6v2.lightAndSwitchGui;

import java.awt.Color;
import java.awt.Point;

import TP6v2.tools.Observable;
import TP6v2.tools.Observer;
import TP6v2.nicellipse.component.NiLabel;
import TP6v2.nicellipse.component.NiRectangle;

public class LampBase extends NiRectangle implements Observer {
	NiLabel label;
	
	public LampBase() {
		super();
		label = new NiLabel("Eteinte");
		label.setForeground(Color.white);
		this.setBackground(Color.black);
		label.setLocation(new Point(20,5));
		add(label);
	}
	
	public Color defaultColor() {
		return Color.black;
	}

	@Override
	public void updateFrom(Observable o) {}

	@Override
	public void updateFrom(Observable o, Object arg) {
		this.label.setText(Boolean.valueOf((boolean) arg) ? "Allume" : "Eteinte");
	}

}
