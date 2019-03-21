package com.scorekeeper.model.scoreboard;

public class ScoreboardImpl implements Scoreboard
{
	int score1;
	int score2;
	
	/**
	 * Default constructor
	 */
	public ScoreboardImpl()
	{
		this.score1 = 0;
		this.score2 = 0;
	}
	
	/**
	 * @param score1
	 * @param score2
	 */
	public ScoreboardImpl(int score1, int score2)
	{
		if(score1 % 10 == 0)
		{
			this.score1 = score1;
		}
		else
		{
			this.score1 = 0;
		}
		
		if(score2 % 10 == 0)
		{
			this.score2 = score2;
		}
		else
		{
			this.score2 = 0;
		}
	}
	
	
	/**
	 * @return the score1
	 */
	public int getScore1()
	{
		return score1;
	}

	/**
	 * @param score1 the score1 to set
	 */
	public void setScore1(int score1)
	{
		if(score1 % 10 == 0)
		{
			this.score1 = score1;
		}
	}

	/**
	 * @return the score2
	 */
	public int getScore2()
	{
		return score2;
	}

	/**
	 * @param score2 the score2 to set
	 */
	public void setScore2(int score2)
	{
		if(score2 % 10 == 0)
		{
			this.score2 = score2;
		}
	}
	
	@Override
	public void incrementScore1()
	{
		this.score1 += 10;
	}
	
	@Override
	public void incrementScore2()
	{
		this.score2 += 10;
	}

	@Override
	public void resetScore1()
	{
		this.score1 = 0;
	}
	
	@Override
	public void resetScore2()
	{
		this.score2 = 0;
		
	}
	
	@Override
	public void resetScores()
	{
		this.score1 = 0;
		this.score2 = 0;
	}
	
	
}
