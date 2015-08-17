package org.gaopan.study.gui;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MessagePanel extends JPanel {
	private int xCoordinate = 20;
	private int yCoordinate = 20;
	private String message = "Welcome to Java";
	private int interval = 10;
	private boolean centered = false;
	
	public MessagePanel() {
		
	}

	public MessagePanel(String message) {
		super();
		this.message = message;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(centered) {
			FontMetrics fm = g.getFontMetrics();
			
			int stringWidth = fm.stringWidth(message);
			int stringHeight = fm.getAscent();
			
			xCoordinate = getWidth() / 2 - stringWidth / 2;
			yCoordinate = getHeight() / 2 + stringHeight / 2;
		}
		
		g.drawString(message, xCoordinate, yCoordinate);
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
		this.repaint();
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
		this.repaint();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		this.repaint();
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
		this.repaint();
	}

	public boolean isCentered() {
		return centered;
	}

	public void setCentered(boolean centered) {
		this.centered = centered;
		this.repaint();
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200, 30);
	}
	
}
