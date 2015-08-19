package org.gaopan.example.gui;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example15_4 extends JFrame {
	public Example15_4() {
		add(new MultiTable());
	}

	public static void main(String[] args) {
		Example15_4 frame = new Example15_4();
		frame.setTitle("Example15_4");
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

class MultiTable extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int edgeSize = Math.min(getWidth(), getHeight());
		
		// 乘法矩形框
		int squareSize = (int)(edgeSize * 0.8);
		int squareX = getWidth() - (5 + squareSize);
		int squareY = getHeight() - (5 + squareSize);
		g.drawRect(squareX, squareY, squareSize, squareSize);
		
		// 字体大小随窗口大小变化而变化
		g.setFont(new Font("SansSerif", Font.PLAIN, (int)(squareSize*0.07)));
		
		// 画框中乘法表
		int fontCellSize = squareSize / 9;
		FontMetrics fm = g.getFontMetrics();
		int valueHeight = fm.getAscent();
		for(int r = 1; r <= 9; ++r) {
			for(int c = 1; c <= 9; ++c) {
				// 每个字体单元格右上角的坐标
				int fontX = squareX + (c - 1) * fontCellSize;
				int fontY = squareY + (r - 1) * fontCellSize;
				
				String value = "" + (r * c);
				int valueWidth = fm.stringWidth(value);
				
				// 字体居中显示时的坐标
				int fontXX = fontX + fontCellSize / 2 - valueWidth / 2;
				int fontYY = fontY + fontCellSize / 2 + valueHeight / 2;
				
				g.drawString(value, fontXX, fontYY);
			}
		}
		
		// 上面的表头
		for(int c = 1; c <= 9; ++c) {
			// 每个字体单元格右上角的坐标
			int fontX = squareX + (c - 1) * fontCellSize;
			int fontY = squareY - fontCellSize;
			
			String value = "" +  c;
			int valueWidth = fm.stringWidth(value);
			
			// 字体居中显示时的坐标
			int fontXX = fontX + fontCellSize / 2 - valueWidth / 2;
			int fontYY = fontY + fontCellSize / 2 + valueHeight / 2;
			
			g.drawString(value, fontXX, fontYY);
		}
		
		// 左边表头
		for(int r = 1; r <= 9; ++r) {
			// 每个字体单元格右上角的坐标
			int fontX = squareX - fontCellSize;
			int fontY = squareY + (r - 1) * fontCellSize;
			
			String value = "" + r;
			int valueWidth = fm.stringWidth(value);
			
			// 字体居中显示时的坐标
			int fontXX = fontX + fontCellSize / 2 - valueWidth / 2;
			int fontYY = fontY + fontCellSize / 2 + valueHeight / 2;
			
			g.drawString(value, fontXX, fontYY);
		}
		
		{
			// 每个字体单元格右上角的坐标
			int fontX = squareX;
			int fontY = squareY - fontCellSize * 2;
			
			String value = "Multiplication Table";
			int valueWidth = fm.stringWidth(value);
			
			// 字体居中显示时的坐标
			int fontXX = fontX + squareSize / 2 - valueWidth / 2;
			int fontYY = fontY + fontCellSize / 2 + valueHeight / 2;
			
			g.drawString(value, fontXX, fontYY);
		}
	}
	
}
