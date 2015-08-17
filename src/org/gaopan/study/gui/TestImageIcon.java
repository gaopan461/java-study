package org.gaopan.study.gui;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestImageIcon extends JFrame {
	private ImageIcon icon1 = new ImageIcon("image/timg.JPG");
	private ImageIcon icon2 = new ImageIcon("image/timg.JPG");
	private ImageIcon icon3 = new ImageIcon("image/timg.JPG");
	private ImageIcon icon4 = new ImageIcon("image/timg.JPG");
	
	public TestImageIcon() {
		setLayout(new GridLayout(1, 4, 5, 5));
		add(new JLabel(icon1));
		add(new JLabel(icon2));
		add(new JButton(icon3));
		add(new JButton(icon4));
	}
	
	public static void main(String[] args) {
		TestImageIcon frame = new TestImageIcon();
		frame.setTitle("TestImageIcon");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
