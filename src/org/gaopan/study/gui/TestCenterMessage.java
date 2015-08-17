package org.gaopan.study.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestCenterMessage extends JFrame {
	public TestCenterMessage() {
		CenterMessagePanel panel = new CenterMessagePanel();
		panel.setFont(new Font("Californian FB", Font.BOLD, 30));
		panel.setBackground(Color.WHITE);
		add(panel);
	}
	
	public static void main(String[] args) {
		TestCenterMessage frame = new TestCenterMessage();
		frame.setTitle("TestCenterMessage");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class CenterMessagePanel extends JPanel {
	private static final String str = "Welcome to Java";
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		
		FontMetrics fm = g.getFontMetrics();
		int stringWidth = fm.stringWidth(str);
		int stringAscent = fm.getAscent();
		
		g.drawString(str, xCenter - stringWidth / 2, 
				yCenter + stringAscent / 2);
	}
	
}
