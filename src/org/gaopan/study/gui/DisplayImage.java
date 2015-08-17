package org.gaopan.study.gui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayImage extends JFrame {
	public DisplayImage() {
		add(new ImagePanel());
	}
	
	public static void main(String[] args) {
		DisplayImage frame = new DisplayImage();
		frame.setTitle("DisplayImage");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class ImagePanel extends JPanel {
	private ImageIcon imageIcon = new ImageIcon("image/timg.JPG");
	private Image image = imageIcon.getImage();
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		float factorImage = (float)imageIcon.getIconWidth() / imageIcon.getIconHeight();
		float factorPanel = (float)getWidth() / getHeight();
		
		int imageWidth, imageHeight;
		if(factorPanel > factorImage) {
			imageHeight = getHeight();
			imageWidth = (int)(imageHeight * factorImage);
		} else {
			imageWidth = getWidth();
			imageHeight = (int)(imageWidth / factorImage);
		}
		
		int imageX = getWidth() / 2 - imageWidth / 2;
		int imageY = getHeight() / 2 - imageHeight / 2;
		g.drawImage(image, imageX, imageY, imageWidth, imageHeight, this);
	}
	
}
