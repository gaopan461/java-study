package org.gaopan.study.gui;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestButton extends JFrame {
	public TestButton() {
		ImageIcon usIcon = new ImageIcon("image/timg.jpg");
		JButton jbt1 = new JButton(usIcon);
		JButton jbt2 = new JButton(usIcon);
		
		JPanel p1 = new JPanel();
		p1.add(jbt1);
		
		JPanel p2 = new JPanel();
		p2.add(jbt2);
		
		JPanel p3 = new JPanel();
		p3.add(jbt1);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(p3, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		JFrame frame = new TestButton();
		frame.setTitle("TestButton");
		frame.setSize(200, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
