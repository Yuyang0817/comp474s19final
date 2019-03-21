package com.scorekeeper.model.scoreboard;

public interface Scoreboard
{
	void setScore1(int score1);
	void setScore2(int score2);
	int getScore1();
	int getScore2();
	void incrementScore1();
	void incrementScore2();
	void resetScore1();
	void resetScore2();
	void resetScores();
}
