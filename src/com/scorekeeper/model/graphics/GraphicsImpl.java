package com.scorekeeper.model.graphics;

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.scorekeeper.model.scoreboard.Scoreboard;
import com.scorekeeper.model.scoreboard.ScoreboardImpl;
import com.scorekeeper.model.timer.Timer;
import com.scorekeeper.model.timer.TimerImpl;

public class GraphicsImpl implements Graphics
{
	public void start()
	{
		JFrame frame= new JFrame("Quidditch Scorekeeper"); //Create window with title "Quidditch Scorekeeper"
		frame.setSize(1450, 800); //Set window size
		final Scoreboard sb = new ScoreboardImpl(); //Creates a scoreboard object for use
		final Timer t = new TimerImpl(); //Creates a timer object for use
		
		/*
		 * Begin creation of buttons & windows
		 */
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
	    JTextField inputTime = new JTextField("00:00:00"); //Add textbox for setTime to use
	    inputTime.setBounds(frame.getWidth()-350, 25, 325, 70); //Set inputTime's location
	    Font inputTimeFont = new Font("MarkerFelt-Wide", Font.PLAIN, 48); //Create font for inputTime
		inputTime.setHorizontalAlignment(JTextField.CENTER); //inputTime text should be centered
		inputTime.setFont(inputTimeFont); //inputTime should have the font created above
	    Button setTime=new Button("Set Time"); //This is the setTime button 
	    setTime.setBounds(frame.getWidth()-350,105,325,70); //Set setTime's location

	    //Create score1 controls
	    Button incrementScore1=new Button("+10"); //This button increments score1
	    incrementScore1.setBounds(25,610,100,100); //Set incrementScore1's location
	    Button decrementScore1=new Button("-10"); //This button decrements score1
	    decrementScore1.setBounds(130,610,100,100); //Set decrementScore1's location
	    JTextField inputScore1 = new JTextField("000"); //Add textbox for setScore1 to use
	    inputScore1.setBounds(240, 610, 210, 100); //Set inputScore1's location
	    Font inputScoreFont = new Font("MarkerFelt-Wide", Font.PLAIN, 72); //Create font for setScore1
		inputScore1.setHorizontalAlignment(JTextField.CENTER); //setScore1 text should be centered
		inputScore1.setFont(inputScoreFont); //setScore1 should have the font created above
	    Button setScore1=new Button("Set Score"); //This button sets score1
	    setScore1.setBounds(490,610,210,100); //Set setScore1's location
	    
	    //Create score2 controls
	    Button incrementScore2=new Button("+10"); //This button increments score2
	    incrementScore2.setBounds(750,610,100,100); //Set incrementScore2's location
	    Button decrementScore2=new Button("-10"); //This button decrements score2
	    decrementScore2.setBounds(860,610,100,100); //Set decrementScore2's location
	    JTextField inputScore2 = new JTextField("000"); //Add textbox for setScore2 to use
	    inputScore2.setBounds(970, 610, 210, 100); //Set inputScore2's location
	    inputScore2.setHorizontalAlignment(JTextField.CENTER); //setScore1 text should be centered
		inputScore2.setFont(inputScoreFont); //setScore1 should have the font created above
	    Button setScore2=new Button("Set Score"); //This button sets score2
	    setScore2.setBounds(1210,610,210,100); //Set setScore2's location
	    
	    //Create notification box & acknowledgement button
	    JTextField notifications = new JTextField(); //Add textbox for setScore2 to use
	    notifications.setBounds(25, frame.getHeight()-80, 1000, 50); //Set inputScore2's location
	    Font notificationFont = new Font("MarkerFelt-Wide", Font.PLAIN, 24); //Create font for inputTime
		notifications.setHorizontalAlignment(JTextField.CENTER); //inputTime text should be centered
		notifications.setFont(notificationFont); //inputTime should have the font created above
		notifications.setEditable(false); //Notification field should not be editable
	    Button acknowledge=new Button("Clear Notification"); //This button sets score2
	    acknowledge.setBounds(1035, frame.getHeight()-80, 390, 50); //Set setScore2's location
	    /*
		 * End creation of buttons & windows
		 */
	    
	    /*
		 * Begin assignment of button functions
		 */
	    //Controls to update timer
	    startTime.addActionListener(new ActionListener() //Dictates what happens when startTime button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {  
	        	t.startTime();
	        }  
	    }); 
	    stopReset.addActionListener(new ActionListener() //Dictates what happens when stopReset button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {  
	        	t.stopTime();
	        }  
	    }); 
	    setTime.addActionListener(new ActionListener() //Dictates what happens when setTime button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {  
	        	t.setTime(inputTime.getText());
	        }  
	    }); 
	    
	    //Controls to update scorebox1
	    incrementScore1.addActionListener(new ActionListener() //Dictates what happens when incrementScore1 button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {  
	        	scorebox1.setText(String.valueOf(sb.incrementScore1()));
	        }  
	    }); 
	    decrementScore1.addActionListener(new ActionListener() //Dictates what happens when decrementScore1 button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {  
	        	scorebox1.setText(String.valueOf(sb.decrementScore1()));
	        }  
	    }); 
	    setScore1.addActionListener(new ActionListener() //Dictates what happens when setScore1 button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {  
	        	scorebox1.setText(String.valueOf(sb.setScore1(Integer.valueOf(inputScore1.getText()))));
	        }  
	    }); 
	    
	    //Controls to update scorebox2
	    incrementScore2.addActionListener(new ActionListener() //Dictates what happens when incrementScore2 button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {  
	        	scorebox2.setText(String.valueOf(sb.incrementScore2()));
	        }  
	    }); 
	    decrementScore2.addActionListener(new ActionListener() //Dictates what happens when decrementScore2 button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {  
	        	scorebox2.setText(String.valueOf(sb.decrementScore2()));
	        }  
	    }); 
	    setScore2.addActionListener(new ActionListener() //Dictates what happens when setScore2 button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {
	        	scorebox2.setText(String.valueOf(sb.setScore2(Integer.valueOf(inputScore2.getText()))));
	        }  
	    }); 
	    
	    //Control to clear notification
	    acknowledge.addActionListener(new ActionListener() //Dictates what happens when acknowledge button is clicked
	    {  
	        public void actionPerformed(ActionEvent e)
	        {
		        notifications.setText("");
	        }  
	    }); 
	    /*
		 * End assignment of button functions
		 */
	    
	    /*
		 * Begin adding items to window
		 */
		frame.add(timebox); //Add timer to window
		
		frame.add(startTime); //Add timer controls to window
	    frame.add(stopReset); 
	    frame.add(inputTime);
	    frame.add(setTime);
		
	    frame.add(scorebox1); //Add scoreboxes to window
	    frame.add(scorebox2);
	    
	    frame.add(startTime); //Add score controls to window
	    frame.add(stopReset); 
	    frame.add(setTime);
	    frame.add(incrementScore1); 
	    frame.add(decrementScore1); 
	    frame.add(inputScore1);
	    frame.add(setScore1);
	    frame.add(incrementScore2); 
	    frame.add(decrementScore2); 
	    frame.add(inputScore2);
	    frame.add(setScore2);
	    
	    frame.add(notifications); //Add notification functions
	    frame.add(acknowledge);
	    /*
		 * End adding items to window
		 */
	    
	    //These things need to go last to prevent loading lag
		frame.setLocationRelativeTo(null); //Centers window on screen
		frame.setLayout(null); //Allows us to manually set item locations
		frame.setResizable(false); //Disallows resizing the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Makes program quit when the window closes
		frame.setVisible(true); //Makes the window visible
	}
}