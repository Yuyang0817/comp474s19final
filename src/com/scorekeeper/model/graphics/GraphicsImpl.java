package com.scorekeeper.model.graphics;

import java.awt.Button;

import javax.swing.JFrame;

public class GraphicsImpl implements Graphics
{
	public void start()
	{
		JFrame frame= new JFrame("Quidditch Scorekeeper"); //Create window with title "Quidditch Scorekeeper"
		frame.setSize(1450, 800); //Set window size
		
		//Create timebox
		final Timebox timebox = new Timebox("00:00:00", 425, 25, 600, 150);
		
		//Create scoreboxes
		final Scorebox scorebox1=new Scorebox("0", 25, 200, 675, 400); //Set default value & position
	    final Scorebox scorebox2=new Scorebox("0", 750, 200, 675, 400); //Set default value & position
		
	    //Create time controls
	    Button startTime=new Button("Start"); //This is the start button
	    startTime.setBounds(25,25,150,150); //Set startTime's location
	    Button stopReset=new Button("Stop/Reset"); //This is the stop/reset button
	    stopReset.setBounds(185,25,150,150); //Set stop/reset's location
	    Button setTime=new Button("Set Time"); //This is the setTime button 
	    setTime.setBounds(frame.getWidth()-350,25,325,150); //Set setTime's location

	    //Create score controls
	    Button incrementScore1=new Button("+10"); //This button increments score1
	    incrementScore1.setBounds(25,610,100,100); //Set incrementScore1's location
	    Button decrementScore1=new Button("-10"); //This button decrements score1
	    decrementScore1.setBounds(130,610,100,100); //Set decrementScore1's location
	    Button setScore1=new Button("Set Score"); //This button sets score1
	    setScore1.setBounds(490,610,210,100); //Set setScore1's location
	    
	    Button incrementScore2=new Button("+10"); //This button increments score2
	    incrementScore2.setBounds(750,610,100,100); //Set incrementScore2's location
	    Button decrementScore2=new Button("-10"); //This button decrements score2
	    decrementScore2.setBounds(860,610,100,100); //Set decrementScore2's location
	    Button setScore2=new Button("Set Score"); //This button sets score2
	    setScore2.setBounds(1210,610,210,100); //Set setScore2's location
	    
	    //Add timer to window
		frame.add(timebox);
		
		//Add timer controls to window
		frame.add(startTime); 
	    frame.add(stopReset); 
	    frame.add(setTime);
		
		//Add scoreboxes to window
	    frame.add(scorebox1);
	    frame.add(scorebox2);
	    
	    //Add score controls to window
	    frame.add(startTime); 
	    frame.add(stopReset); 
	    frame.add(setTime);
	    frame.add(incrementScore1); 
	    frame.add(decrementScore1); 
	    frame.add(setScore1);
	    frame.add(incrementScore2); 
	    frame.add(decrementScore2); 
	    frame.add(setScore2);
	    
	    //These things need to go last to prevent loading lag
		frame.setLocationRelativeTo(null); //Centers window on screen
		frame.setLayout(null); //Allows us to manually set item locations
		frame.setResizable(false); //Disallows resizing the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Makes program quit when the window closes
		frame.setVisible(true); //Makes the window visible
	}
}