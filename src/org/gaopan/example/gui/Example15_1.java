package org.gaopan.example.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example15_1 extends JFrame {
	public Example15_1() {
		add(new GridPanel());
	}

	public static void main(String[] args) {
		Example15_1 frame = new Example15_1();
		frame.setTitle("Example15_1");
		frame.setSize(200, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class GridPanel extends JPanel {
	private int row = 3;
	private int col = 4;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xSize = getWidth() / col;
		int ySize = getHeight() / row;
		
		g.setColor(Color.BLUE);
		for(int r = 0; r < row - 1; ++r) {
			int startx = 0;
			int starty = r * ySize + ySize;
			int endx = getWidth();
			int endy = r * ySize + ySize;
			g.drawLine(startx, starty, endx, endy);
		}
		
		g.setColor(Color.RED);
		for(int c = 0; c < col - 1; ++c) {
			int startx = c * xSize + xSize;
			int starty = 0;
			int endx = c * xSize + xSize;
			int endy = getHeight();
			g.drawLine(startx, starty, endx, endy);
		}
	}
	
}
