package com.scorekeeper.model.graphics;

import java.awt.Font;

import javax.swing.JTextField;

public class Scorebox extends JTextField //Scoreboxes are textfields
{
	/**
	 * Default constructor is inherited
	 */
	public Scorebox() {
		super();
		this.format(); //Sets parameters to how scoreboxes should look
	}

	/**
	 * @param text
	 */
	public Scorebox(String text) {
		super(text); //Sets default text
		this.format();
	}
	
	public Scorebox(int x, int y, int width, int height)
	{
		super();
		this.setBounds(x, y, width, height); //Sets location & size
		this.format(); //Sets parameters to how scoreboxes should look
	}
	
	public Scorebox(String text, int x, int y, int width, int height)
	{
		super(text); //Sets default text
		this.setBounds(x, y, width, height); //Sets location & size
		this.format(); //Sets parameters to how scoreboxes should look
	}
	
	/*
	 *  Sets parameters to how scoreboxes should look
	 */
	private void format()
	{
		Font scorebox = new Font("MarkerFelt-Wide", Font.PLAIN, 256); //Create a font
		this.setEditable(false); //You cannot type into scoreboxes
		this.setHorizontalAlignment(JTextField.CENTER); //Text in scoreboxes should be centered
		this.setFont(scorebox); //Scoreboxes should use the font created above
	}
}
