package org.gaopan.example.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example12_10 extends JFrame {
	public Example12_10() {
		setLayout(new GridLayout(10, 10));
		
		Color[] colors = {Color.WHITE, Color.BLACK};
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				add(new JButton()).setBackground(colors[(i+j)%2]);;
			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new Example12_10();
		frame.setTitle("Example12_10");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
