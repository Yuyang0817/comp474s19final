package com.scorekeeper.model.graphics;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GraphicsImpl implements Graphics
{
	public void start()
	{
		JFrame frame= new JFrame("Quidditch Scorekeeper"); //Create window with title "Quidditch Scorekeeper"
		frame.setSize(1450, 800); //Set window size
		
		//Create scoreboxes
		final JTextField scorebox1=new JTextField("0"); //Default value is 0
		scorebox1.setBounds(25, 200, 675, 400); //Sets location & size
		scorebox1.setEditable(false); //You cannot type into this box
		scorebox1.setHorizontalAlignment(JTextField.CENTER); //Center the text in the box
	    final JTextField scorebox2=new JTextField("0"); //Default value is 0
		scorebox2.setBounds(750, 200, 675, 400); //Sets location & size
		scorebox2.setEditable(false); //You cannot type into this box
		scorebox2.setHorizontalAlignment(JTextField.CENTER); //Center the text in the box
		
		//Add scoreboxes to window
	    frame.add(scorebox1);
	    frame.add(scorebox2);
	    
	    //These things need to go last to prevent loading lag
		frame.setLocationRelativeTo(null); //Centers window on screen
		frame.setLayout(null); //Allows us to manually set item locations
		frame.setResizable(false); //Disallows resizing the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Makes program quit when the window closes
		frame.setVisible(true); //Makes the window visible
	}
}