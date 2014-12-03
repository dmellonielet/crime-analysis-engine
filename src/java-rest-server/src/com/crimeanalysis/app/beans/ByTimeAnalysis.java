package com.crimeanalysis.app.beans;

public class ByTimeAnalysis
{

	
	private String crimeTime;
	private int totalCount;
	public String getCrimeTime()
	{
		return crimeTime;
	}
	public void setCrimeTime(String crimeTime)
	{
		this.crimeTime = crimeTime;
	}
	public int getTotalCount()
	{
		return totalCount;
	}
	public void setTotalCount(int totalCount)
	{
		this.totalCount = totalCount;
	}
	public ByTimeAnalysis(String crimeTime, int totalCount)
	{
		super();
		this.crimeTime = crimeTime;
		this.totalCount = totalCount;
	}
	
}
