package org.gaopan.study.gui;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class TestMessagePanel extends JFrame {
	public TestMessagePanel() {
		MessagePanel p1 = new MessagePanel("Welcome to Java");
		MessagePanel p2 = new MessagePanel("Java is fun");
		MessagePanel p3 = new MessagePanel("Java is cool");
		MessagePanel p4 = new MessagePanel("I love Java");
		
		p1.setFont(new Font("SansSerif", Font.ITALIC, 20));
		p2.setFont(new Font("Courier", Font.BOLD, 20));
		p3.setFont(new Font("Times", Font.ITALIC, 20));
		p4.setFont(new Font("Californian FB", Font.PLAIN, 20));
		
		p1.setCentered(true);
		
		setLayout(new GridLayout(2, 2));
		add(p1);
		add(p2);
		add(p3);
		add(p4);
	}

	public static void main(String[] args) {
		TestMessagePanel frame = new TestMessagePanel();
		frame.setTitle("TestMessagePanel");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
