package org.gaopan.example.gui;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example15_2 extends JFrame {
	public Example15_2() {
		setLayout(new GridLayout(1, 2, 5, 5));
		add(new OvalButton("OK"));
		add(new OvalButton("Cancel"));
	}

	public static void main(String[] args) {
		Example15_2 frame = new Example15_2();
		frame.setTitle("Example15_2");
		frame.setSize(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class OvalButton extends JButton {
	public OvalButton(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
	}
	
}
