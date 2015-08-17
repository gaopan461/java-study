package org.gaopan.example.gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Example12_5 extends JFrame {
	public Example12_5() {
		setLayout(new GridLayout(0, 1));
		
		Border lineBorder = new LineBorder(Color.BLACK, 5);
		
		JLabel jlbl1 = new JLabel("Department of Computer Science");
		JLabel jlbl2 = new JLabel("School of Computing");
		JLabel jlbl3 = new JLabel("Armstrong Atlantic State University");
		JLabel jlbl4 = new JLabel("Tel:18801019550"); 
		jlbl1.setBorder(lineBorder);
		jlbl2.setBorder(lineBorder);
		jlbl3.setBorder(lineBorder);
		jlbl4.setBorder(lineBorder);
		add(jlbl1);
		add(jlbl2);
		add(jlbl3);
		add(jlbl4);
	}
	
	public static void main(String[] args) {
		JFrame frame = new Example12_5();
		frame.setTitle("Example12_5");
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.pack();
	}

}
