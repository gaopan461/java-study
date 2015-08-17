package org.gaopan.study.gui;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawArcs extends JFrame {
	public DrawArcs() {
		add(new ArcsPanel());
	}
	
	public static void main(String[] args) {
		DrawArcs frame = new DrawArcs();
		frame.setTitle("DrawArcs");
		frame.setSize(250, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class ArcsPanel extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		
		int radius = (int)(Math.min(xCenter, yCenter) * 0.8);
		int x = xCenter - radius;
		int y = yCenter - radius;
		
		g.fillArc(x, y, radius * 2, radius * 2, 0, 30);
		g.fillArc(x, y, radius * 2, radius * 2, 90, 30);
		g.fillArc(x, y, radius * 2, radius * 2, 180, 30);
		g.fillArc(x, y, radius * 2, radius * 2, 270, 30);
	}
	
}
