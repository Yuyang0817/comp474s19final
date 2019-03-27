package com.scorekeeper.model.scoreboard;

public interface Scoreboard
{
	int setScore1(int score1);
	int setScore2(int score2);
	int getScore1();
	int getScore2();
	int incrementScore1();
	int incrementScore2();
	int decrementScore1();
	int decrementScore2();
	void resetScore1();
	void resetScore2();
	void resetScores();
}
