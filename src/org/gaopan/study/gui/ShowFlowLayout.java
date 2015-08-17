package org.gaopan.study.gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowFlowLayout extends JFrame {
	public ShowFlowLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		JLabel lblFirstName = new JLabel("First Name");
		add(lblFirstName);
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
//		add(lblFirstName);
	}
	
	public static void main(String[] args) {
		JFrame frame = new ShowFlowLayout();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
