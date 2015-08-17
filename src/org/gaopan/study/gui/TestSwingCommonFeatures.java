package org.gaopan.study.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TestSwingCommonFeatures extends JFrame {
	public TestSwingCommonFeatures() {
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
		JButton jbtLeft = new JButton("Left");
		JButton jbtRight = new JButton("Right");
		JButton jbtCenter = new JButton("Center");
		
		jbtLeft.setBackground(Color.WHITE);
		jbtCenter.setForeground(Color.GREEN);
		jbtRight.setToolTipText("This is the Right button");
		
		p1.add(jbtLeft);
		p1.add(jbtCenter);
		p1.add(jbtRight);
		
		p1.setBorder(new TitledBorder("Three Buttons"));
		
		Font lagerFont = new Font("TimesRoman", Font.BOLD, 20);
		Border lineBorder = new LineBorder(Color.BLACK, 2);
		
		JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
		JLabel jlbRed = new JLabel("Red");
		JLabel jlbOrange = new JLabel("Orange");
		
//		jlbRed.setVisible(false);
		
		jlbRed.setForeground(Color.RED);
		jlbOrange.setForeground(Color.ORANGE);
		
		jlbRed.setFont(lagerFont);
		jlbOrange.setFont(lagerFont);
		
		jlbRed.setBorder(lineBorder);
		jlbOrange.setBorder(lineBorder);
		
		p2.add(jlbRed);
		p2.add(jlbOrange);
		p2.setBorder(new TitledBorder("Two labels"));
		
		setLayout(new GridLayout(2, 1, 5, 5));
		this.add(p1);
		this.add(p2);
	}
	
	public static void main(String[] args) {
		JFrame frame = new TestSwingCommonFeatures();
		frame.setTitle("TestSwingCommonFeatures");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
