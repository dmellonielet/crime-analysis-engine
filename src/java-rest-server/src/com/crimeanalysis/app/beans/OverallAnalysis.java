package com.crimeanalysis.app.beans;

public class OverallAnalysis
{

	private int crimePerDayAvg;
	private int mostCrime;
	private String mostUnsafeTime;
	private String mostUnsafeDay;
	public int getCrimePerDayAvg()
	{
		return crimePerDayAvg;
	}
	public void setCrimePerDayAvg(int crimePerDayAvg)
	{
		this.crimePerDayAvg = crimePerDayAvg;
	}
	public int getMostCrime()
	{
		return mostCrime;
	}
	public void setMostCrime(int mostCrime)
	{
		this.mostCrime = mostCrime;
	}
	public String getMostUnsafeTime()
	{
		return mostUnsafeTime;
	}
	public void setMostUnsafeTime(String mostUnsafeTime)
	{
		this.mostUnsafeTime = mostUnsafeTime;
	}
	public String getMostUnsafeDay()
	{
		return mostUnsafeDay;
	}
	public void setMostUnsafeDay(String mostUnsafeDay)
	{
		this.mostUnsafeDay = mostUnsafeDay;
	}
}
