package com.scorekeeper.model.graphics;

import javax.swing.JFrame;

public class GraphicsImpl implements Graphics
{
	public void start()
	{
		JFrame frame= new JFrame("Quidditch Scorekeeper"); //Create window with title "Quidditch Scorekeeper"
		frame.setSize(1450, 800); //Set window size
		
		//Create timebox
		final Timebox timebox = new Timebox("00:00:00", 425, 25, 600, 150);
		frame.add(timebox);
		
		//Create scoreboxes
		final Scorebox scorebox1=new Scorebox("0", 25, 200, 675, 400); //Set default value & position
	    final Scorebox scorebox2=new Scorebox("0", 750, 200, 675, 400); //Set default value & position
		
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