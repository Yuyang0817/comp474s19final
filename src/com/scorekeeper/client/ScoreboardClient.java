package com.scorekeeper.client;

import com.scorekeeper.model.graphics.Graphics;
import com.scorekeeper.model.graphics.GraphicsImpl;

public class ScoreboardClient
{
	public static void main(String args[])
	{
		Graphics testImplementation = new GraphicsImpl();
		testImplementation.start();
	}
}