package org.gaopan.study.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class DisplayClock extends JFrame {
	public DisplayClock() {
		StillClock clock = new StillClock();
		MessagePanel messagePanel = new MessagePanel(clock.getHour()
				+ ":" + clock.getMinute() + ":" + clock.getSecond());
		messagePanel.setCentered(true);
		messagePanel.setForeground(Color.blue);
		messagePanel.setFont(new Font("Courier", Font.BOLD, 16));
//		messagePanel.setBorder(new LineBorder(Color.BLACK, 2));
		
		add(clock);
		add(messagePanel, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		DisplayClock frame = new DisplayClock();
		frame.setTitle("DisplayClock");
		frame.setSize(300, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
