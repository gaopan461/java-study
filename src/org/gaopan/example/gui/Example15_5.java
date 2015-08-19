package org.gaopan.example.gui;

import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example15_5 extends JFrame {
	public Example15_5() {
		add(new TriangleDigital());
	}

	public static void main(String[] args) {
		Example15_5 frame = new Example15_5();
		frame.setTitle("Example15_5");
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

class TriangleDigital extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int edgeSize = Math.min(getWidth(), getHeight());
		FontMetrics fm = g.getFontMetrics();
		
		int fontWidth, cellSize, cellNum;
		int i = 9;
		while(true) {
			fontWidth = fm.stringWidth("" + i);
			cellSize = Math.max(fm.getHeight(), fontWidth);
			cellNum = edgeSize / cellSize;
			if(cellNum < i) {
				break;
			}
			
			i = i * 10 + 9;
		}
		
		for(int r = 1; r <= cellNum; ++r) {
			for(int c = 1; c <= r; ++c) {
				// 每个字体单元格右上角的坐标
				int fontX = (c - 1) * cellSize;
				int fontY = (r - 1) * cellSize;
				
				String value = "" + c;
				
				// 字体居中显示时的坐标
				int fontXX = fontX + cellSize / 2 - fontWidth / 2;
				int fontYY = fontY + cellSize / 2 + fm.getAscent() / 2;
				
				g.drawString(value, fontXX, fontYY);
			}
		}
	}
	
}
