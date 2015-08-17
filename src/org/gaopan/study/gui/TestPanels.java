package org.gaopan.study.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestPanels extends JFrame {
	public TestPanels() {
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 3));
		
		for(int i = 1; i <= 9; ++i) {
			p1.add(new JButton("" + i)).setBackground(Color.RED);;
		}
		
		p1.add(new JButton("" + 0)).setForeground(Color.GRAY);;
		p1.add(new JButton("Start"));
		p1.add(new JButton("Stop"));
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField("Time to be displayed here"),
				BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		
		add(new JTextField("Food to be placed here"),
				BorderLayout.CENTER);
		add(p2, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		TestPanels frame = new TestPanels();
		frame.setTitle("The Front View of a Micorwave Oven");
		frame.setSize(400, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = e.getAvailableFontFamilyNames();
		for(String name : fontNames) {
			System.out.println(name);
		}
	}
}
