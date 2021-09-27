package TP6v2.lightAndSwitchGui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.CubicCurve2D;

import TP6v2.nicellipse.component.NiShape;


public class ElectricalWire extends NiShape {

	public ElectricalWire(CubicCurve2D curve) {
		super(curve);
		this.setBackground(Color.LIGHT_GRAY);
		this.setStroke(new BasicStroke(3));
		this.setForeground(Color.GRAY);
	}
}
