package com.scorekeeper.model.timer;

public class TimerImpl implements Timer
{
	int hours;
	int minutes;
	int seconds;
	
	/**
	 * Default constructor
	 */
	public TimerImpl() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public TimerImpl(String time)
	{
		//TODO
	}
	
	/**
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public TimerImpl(int hours, int minutes, int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	/**
	 * Start the timer
	 */
	public void startTime()
	{
		//TODO
	}
	
	/**
	 * Stop the timer
	 */
	public void stopTime()
	{
		//TODO
	}
	
	/**
	 * @return the hours
	 */
	public int[] getTime()
	{
		//TODO
		return new int[]{};
	}
	
	/**
	 * @param hours the hours to set
	 * @param minutes the minutes to set
	 * @param seconds the seconds to set
	 */
	public void setTime(int hours, int minutes, int seconds)
	{
		//TODO
	}

	@Override
	public void setTime(String time)
	{
		//TODO
	}
}
