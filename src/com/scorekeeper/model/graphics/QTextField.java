package com.scorekeeper.model.graphics;

import java.awt.Button;
import java.awt.Font;

import javax.swing.JTextField;

public class QTextField extends JTextField
{
	int type;

	/**
	 * 
	 */
	public QTextField() 
	{
		super();
		this.format();
	}
	
	/**
	 * @param text
	 */
	public QTextField(String text) 
	{
		super(text); //Sets default text
		this.format(); //Sets parameters according to type
	}
	
	/**
	 * @param inputType
	 */
	public QTextField(int type) 
	{
		this.type = type; //Sets type of box
		this.format(); //Sets parameters according to type
	}
	
	/**
	 * @param text
	 * @param inputType
	 */
	public QTextField(String text, int type)
	{
		super(text);
		this.type = type; //Sets type of box
		this.format(); //Sets parameters according to type
	}
	
	/**
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public QTextField(int x, int y, int width, int height)
	{
		super();
		this.setBounds(x, y, width, height); //Sets location & size
		this.format(); //Sets parameters according to type
	}
	
	/**
	 * @param text
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public QTextField(String text, int x, int y, int width, int height)
	{
		super(text); //Sets default text
		this.setBounds(x, y, width, height); //Sets location & size
		this.format(); //Sets parameters according to type
	}
	
	/**
	 * @param type
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public QTextField(int type, int x, int y, int width, int height)
	{
		super();
		this.type = type; //Sets type of box
		this.setBounds(x, y, width, height); //Sets location & size
		this.format(); //Sets parameters according to type
	}
	
	/**
	 * @param text
	 * @param type
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public QTextField(String text, int type, int x, int y, int width, int height)
	{
		super(text); //Sets default text
		this.type = type; //Sets type of box
		this.setBounds(x, y, width, height); //Sets location & size
		this.format(); //Sets parameters according to type
	}
	
	/*
	 * @param type the type to set
	 */
	public void setType(int type)
	{
		this.type = type;
	}

	private void format()
	{
		int type = this.type;
		switch(type)
		{
			case 1: //Timekeeper Display
				Font timebox = new Font("MarkerFelt-Wide", Font.PLAIN, 96); //Create font
				this.setEditable(false); //You cannot type in timeboxes
				this.setHorizontalAlignment(JTextField.CENTER); //Timebox text should be centered
				this.setFont(timebox); //Timeboxes should have the font created above
	            break; 
	        case 2: //Score Display
	        	Font scorebox = new Font("MarkerFelt-Wide", Font.PLAIN, 256); //Create a font
	    		this.setEditable(false); //You cannot type into scoreboxes
	    		this.setHorizontalAlignment(JTextField.CENTER); //Text in scoreboxes should be centered
	    		this.setFont(scorebox); //Scoreboxes should use the font created above
	            break; 
			case 3: //Time Input
				Font inputTimeFont = new Font("MarkerFelt-Wide", Font.PLAIN, 48); //Create font for inputTime
				this.setHorizontalAlignment(JTextField.CENTER); //inputTime text should be centered
				this.setFont(inputTimeFont); //inputTime should have the font created above
	            break; 
	        case 4: //Score Input
	        	Font inputScoreFont = new Font("MarkerFelt-Wide", Font.PLAIN, 72); //Create font for setScore1
	    		this.setHorizontalAlignment(JTextField.CENTER); //setScore1 text should be centered
	    		this.setFont(inputScoreFont); //setScore1 should have the font created above
	            break; 
	        case 5: //Notification Display
	        	Font notificationFont = new Font("MarkerFelt-Wide", Font.PLAIN, 24); //Create font for inputTime
	    		this.setHorizontalAlignment(JTextField.CENTER); //inputTime text should be centered
	    		this.setFont(notificationFont); //inputTime should have the font created above
	    		this.setEditable(false); //Notification field should not be editable
	            break; 
	        default: 
	            this.setVisible(false);
		}
	}
}
