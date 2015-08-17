package org.gaopan.study.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameWithComponents {

	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrameWithComponents");
		
		JButton jbtOK = new JButton("OK");
		frame.add(jbtOK);
//		frame.getContentPane().add(jbtOK);
//		frame.remove(jbtOK);
		
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
