package org.gaopan.example.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example12_4 extends JFrame {
	
	public static class MyPanel extends JPanel {
		public MyPanel() {
			setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			for(int i = 1; i <=3; ++i) {
				add(new JButton("Button " + i));
			}
		}
	}
	
	public Example12_4() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		add(new MyPanel());
		add(new MyPanel());
	}
	
	public static void main(String[] args) {
		JFrame frame = new Example12_4();
		frame.setTitle("Example12_4");
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.pack();
	}

}
