package org.gaopan.study.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShowBorderLayout extends JFrame {
	public ShowBorderLayout() {
		setLayout(new BorderLayout(5, 10));
		
		JButton jbtEast = new JButton("East");
		add(jbtEast, BorderLayout.EAST);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("Center"), BorderLayout.CENTER);
//		add(jbtEast, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		ShowBorderLayout frame = new ShowBorderLayout();
		frame.setTitle("ShowBorderLayout");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
