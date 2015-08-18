package org.gaopan.example.gui;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Polygon;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example15_9 extends JFrame {
	public Example15_9() {
		setLayout(new GridLayout(0, 3));
		add(new Line(10, 10, 70, 30, 5));
		add(new Rect(10, 10, 100, 50));
		add(new RoundRect(10, 10, 100, 200, 40, 20));
		add(new Circle(10, 10, 30));
		add(new Oval(10, 10, 50, 100));
		add(new Arc(10, 10, 100, 100, 0, 180));
		
		Polygon p = new Polygon();
		p.addPoint(20, 40);
		p.addPoint(30, 50);
		p.addPoint(40, 90);
		p.addPoint(90, 10);
		p.addPoint(10, 30);
		add(new Poly(p));
	}
	
	public static void main(String[] args) {
		Example15_9 frame = new Example15_9();
		frame.setTitle("Example15_9");
		frame.setSize(500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class Line extends JPanel {
	private int startx;
	private int starty;
	private int endx;
	private int endy;
	private int lineWidth;
	
	public Line(int startx, int starty, int endx, int endy, int lineWidth) {
		super();
		this.startx = startx;
		this.starty = starty;
		this.endx = endx;
		this.endy = endy;
		this.lineWidth = lineWidth;
		this.setBorder(BorderFactory.createTitledBorder("Line"));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < lineWidth; ++i) {
			g.drawLine(startx, starty + i, endx, endy + i);
		}
	};
	
}

class Rect extends JPanel {
	private int startx;
	private int starty;
	private int width;
	private int height;
	
	public Rect(int startx, int starty, int width, int height) {
		super();
		this.startx = startx;
		this.starty = starty;
		this.width = width;
		this.height = height;
		this.setBorder(BorderFactory.createTitledBorder("Rect"));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(startx, starty, width, height);
	}
	
}

class RoundRect extends JPanel {
	private int startx;
	private int starty;
	private int width;
	private int height;
	private int arcWidth;
	private int arcHeight;
	
	public RoundRect(int startx, int starty, int width, int height, int arcWidth, int arcHeight) {
		super();
		this.startx = startx;
		this.starty = starty;
		this.width = width;
		this.height = height;
		this.arcWidth = arcWidth;
		this.arcHeight = arcHeight;
		this.setBorder(BorderFactory.createTitledBorder("RoundRect"));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRoundRect(startx, starty, width, height, arcWidth, arcHeight);
	}

}

class Circle extends JPanel {
	private int startx;
	private int starty;
	private int radius;
	
	public Circle(int startx, int starty, int radius) {
		super();
		this.startx = startx;
		this.starty = starty;
		this.radius = radius;
		this.setBorder(BorderFactory.createTitledBorder("Circle"));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(startx, starty, radius * 2, radius * 2);
	}
	
}

class Oval extends JPanel {
	private int startx;
	private int starty;
	private int width;
	private int height;
	
	public Oval(int startx, int starty, int width, int height) {
		super();
		this.startx = startx;
		this.starty = starty;
		this.width = width;
		this.height = height;
		this.setBorder(BorderFactory.createTitledBorder("Oval"));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(startx, starty, width, height);
	}
	
}

class Arc extends JPanel {
	private int startx;
	private int starty;
	private int width;
	private int height;
	private int startAngle;
	private int arcAngle;
	
	public Arc(int startx, int starty, int width, int height, int startAngle, int arcAngle) {
		super();
		this.startx = startx;
		this.starty = starty;
		this.width = width;
		this.height = height;
		this.startAngle = startAngle;
		this.arcAngle = arcAngle;
		this.setBorder(BorderFactory.createTitledBorder("Arc"));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawArc(startx, starty, width, height, startAngle, arcAngle);
	}

}

class Poly extends JPanel {
	private Polygon polygon;

	public Poly(Polygon polygon) {
		super();
		this.polygon = polygon;
		this.setBorder(BorderFactory.createTitledBorder("Poly"));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawPolygon(polygon);
	}
	
}
