package com.scorekeeper.model.graphics;

import java.awt.Font;

import javax.swing.JTextField;

public class Timebox extends JTextField
{
	/**
	 * Default constructor
	 */
	public Timebox() {
		super();
		this.format(); //Formats timeboxes to look how we want
	}

	/**
	 * @param text
	 */
	public Timebox(String text) {
		super(text); //Sets default text
		this.format(); //Formats timeboxes to look how we want
	}
	
	public Timebox(int x, int y, int width, int height)
	{
		super();
		this.setBounds(x, y, width, height); //Sets location & size
		this.format(); //Formats timeboxes to look how we want
	}
	
	public Timebox(String text, int x, int y, int width, int height)
	{
		super(text); //Sets default text
		this.setBounds(x, y, width, height); //Sets location & size
		this.format(); //Formats timeboxes to look how we want
	}
	
	private void format()
	{
		Font timebox = new Font("MarkerFelt-Wide", Font.PLAIN, 96); //Create font
		this.setEditable(false); //You cannot type in timeboxes
		this.setHorizontalAlignment(JTextField.CENTER); //Timebox text should be centered
		this.setFont(timebox); //Timeboxes should have the font created above
	}
}
