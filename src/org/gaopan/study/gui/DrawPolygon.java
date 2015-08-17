package org.gaopan.study.gui;

import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawPolygon extends JFrame {
	public DrawPolygon() {
		add(new PolygonsPanel());
	}
	
	public static void main(String[] args) {
		DrawPolygon frame = new DrawPolygon();
		frame.setTitle("DrawArcs");
		frame.setSize(250, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class PolygonsPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		
		int radius = (int)(Math.min(xCenter, yCenter) * 0.8);
		
		Polygon polygon = new Polygon();
		polygon.addPoint(xCenter + radius, yCenter);
		polygon.addPoint((int)(xCenter + radius * Math.cos(Math.PI * 2 / 6)), 
				(int)(yCenter - radius * Math.sin(Math.PI * 2 / 6)));
		polygon.addPoint((int)(xCenter + radius * Math.cos(2 * Math.PI * 2 / 6)), 
				(int)(yCenter - radius * Math.sin(2 * Math.PI * 2 / 6)));
		polygon.addPoint((int)(xCenter + radius * Math.cos(3 * Math.PI * 2 / 6)), 
				(int)(yCenter - radius * Math.sin(3 * Math.PI * 2 / 6)));
		polygon.addPoint((int)(xCenter + radius * Math.cos(4 * Math.PI * 2 / 6)), 
				(int)(yCenter - radius * Math.sin(4 * Math.PI * 2 / 6)));
		polygon.addPoint((int)(xCenter + radius * Math.cos(5 * Math.PI * 2 / 6)), 
				(int)(yCenter - radius * Math.sin(5 * Math.PI * 2 / 6)));
		
		g.drawPolygon(polygon);
	}
	
}
