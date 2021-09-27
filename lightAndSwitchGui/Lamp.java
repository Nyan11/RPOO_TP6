package TP6v2.lightAndSwitchGui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.geom.CubicCurve2D;

import TP6v2.tools.Observer;
import TP6v2.nicellipse.component.NiRectangle;
import TP6v2.nicellipse.component.NiSpace;

public class Lamp extends NiRectangle {

	public Lamp() {
		LightBulb lightBulb;
		PowerSwitch powerSwitch;
		ElectricalWire wire;
		LampBase lampBase;

		setSize(new Dimension(240, 160));
	
		lightBulb = new LightBulb();
		lightBulb.setSize(new Dimension(100, 100));

		lampBase = new LampBase();
		lampBase.setLocation(new Point(0, 100));
		lampBase.setSize(new Dimension(100, 20));

		wire = new ElectricalWire(new CubicCurve2D.Double(90, 110, 170, 200, 190, 65, 200, 65));

		powerSwitch = new PowerSwitch();
		powerSwitch.setLocation(new Point(200, 60));
		powerSwitch.setSize(new Dimension(30, 10));

		add(lightBulb);
		add(powerSwitch);
		add(lampBase);
		add(wire);
		
		powerSwitch.register((Observer) lampBase);
		powerSwitch.register((Observer) lightBulb);
	}

	public Color defaultColor() {
		return Color.lightGray;
	}

	public static void createAndShowGUI() {
		NiSpace space = new NiSpace("Lamp", new Dimension(240, 160));
		space.add(new Lamp());
		space.openInWindow();
	}
	

	public static void main(String args[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
