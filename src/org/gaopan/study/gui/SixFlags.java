package org.gaopan.study.gui;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SixFlags extends JFrame {
	private Image image = new ImageIcon("image/timg.jpg").getImage();
	
	public SixFlags() {
		setLayout(new GridLayout(2, 0, 5, 5));
		add(new ImageViewer(image));
		add(new ImageViewer(image));
		add(new ImageViewer(image));
		add(new ImageViewer(image));
		add(new ImageViewer(image));
		add(new ImageViewer(image));
	}
	
	public static void main(String[] args) {
		SixFlags frame = new SixFlags();
		frame.setTitle("SixFlags");
		frame.setSize(400, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
