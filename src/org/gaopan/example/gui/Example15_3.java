package org.gaopan.example.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example15_3 extends JFrame {
	public Example15_3() {
		add(new ChessBoard(5, 9));
	}

	public static void main(String[] args) {
		Example15_3 frame = new Example15_3();
		frame.setTitle("Example15_3");
		frame.setSize(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

class ColorButton extends JButton {
	private Color color;

	public ColorButton(Color color) {
		super();
		this.color = color;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(0, 0, getWidth(), getHeight());
	}
	
}

class ChessBoard extends JPanel {
	private Color color = Color.WHITE;
	private Color firstColor = Color.WHITE;
	
	public ChessBoard(int row, int col) {
		super();
		setLayout(new GridLayout(row, col));
		for(int r = 0; r < row; ++r) {
			color = firstColor;
			for(int c = 0; c < col; ++c) {
				add(new ColorButton(color));
				flipColor();
				
			}
			flipFirstColor();
		}
	}
	
	private void flipColor() {
		if(color == Color.WHITE) {
			color = Color.BLACK;
		} else {
			color = Color.WHITE;
		}
	}
	
	private void flipFirstColor() {
		if(firstColor == Color.WHITE) {
			firstColor = Color.BLACK;
		} else {
			firstColor = Color.WHITE;
		}
	}
	
}
