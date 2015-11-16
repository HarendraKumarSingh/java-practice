package com.harendra.practice;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.Color;
import java.util.Arrays;

public class DrawChessBoard extends JFrame {
	/**
	 * Override JFrame paint method for 2D graphics
	 */
	public void paint(Graphics g) {
		int row;
		int col;
		int x = 0;
		int y = 0;
//		g.drawString("", x + 50, y + 50);
		for (row = 0; row < 8; row++) {
			for (col = 0; col < 8; col++) {
				x = col * 50;
				y = 450 - row * 50;
				if ((row % 2) == (col % 2))
					g.setColor(Color.WHITE);
				else
					g.setColor(Color.BLACK);

				g.fillRect(x, y, 50, 50);
			}
		}
	}

	public static void main(String args[]) {
		DrawChessBoard draw = new DrawChessBoard();
		draw.setTitle("CheckerBoard");
		draw.setSize(550, 550);

		draw.setDefaultCloseOperation(EXIT_ON_CLOSE);
		draw.setVisible(true);
	}
}
