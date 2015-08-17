package org.gaopan.example.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example12_1 extends JFrame {
	public Example12_1() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
		for(int i = 1; i <=3; ++i) {
			p1.add(new JButton("Button " + i));
		}
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
		for(int i = 4; i <=6; ++i) {
			p2.add(new JButton("Button " + i));
		}
		
		add(p1);
		add(p2);
	}
	
	public static void main(String[] args) {
		JFrame frame = new Example12_1();
		frame.setTitle("Example12_1");
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.pack();
	}

}
