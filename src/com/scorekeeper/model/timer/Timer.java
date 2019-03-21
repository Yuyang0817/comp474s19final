package com.scorekeeper.model.timer;

public interface Timer
{
	void startTime();
	void stopTime();
	void setTime(int hours, int minutes, int seconds);
	int[] getTime();
}
