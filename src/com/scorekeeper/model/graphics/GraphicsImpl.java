package com.scorekeeper.model.graphics;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GraphicsImpl implements Graphics
{
	static GraphicsConfiguration gc;
	public void start()
	{
		JFrame frame= new JFrame(gc);	
		frame.setTitle("Quidditch Scorekeeper");
		frame.setSize(1450, 800);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JButton button,button1, button2, button3,button4;
		button = new JButton("left");
		button1 = new JButton("right");
		button2 = new JButton("top");
		button3 = new JButton("bottom");
		button4 = new JButton("center");
		frame.add(button, BorderLayout.WEST);
		frame.add(button1, BorderLayout.EAST);
		frame.add(button2, BorderLayout.NORTH);
		frame.add(button3, BorderLayout.SOUTH);
		frame.add(button4, BorderLayout.CENTER);
	}
}