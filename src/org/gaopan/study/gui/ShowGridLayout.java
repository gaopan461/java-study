package org.gaopan.study.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowGridLayout extends JFrame {
	public ShowGridLayout() {
		setLayout(new GridLayout(3, 2, 5, 5));
		
		JLabel jlblFirstName = new JLabel("First Name");
		add(jlblFirstName);
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
//		add(jlblFirstName);
	}
	
	public static void main(String[] args) {
		JFrame frame = new ShowGridLayout();
		frame.setTitle("ShowGridLayout");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(false);
		frame.setVisible(true);
	}
}
