package com.crimeanalysis.app.modules;

public class ByDayAnalysis
{
	private String dayOfWeek;
	private int	totalCount;
	public String getDayOfWeek()
	{
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek)
	{
		this.dayOfWeek = dayOfWeek;
	}
	public ByDayAnalysis(String dayOfWeek, int totalCount)
	{
		super();
		this.dayOfWeek = dayOfWeek;
		this.totalCount = totalCount;
	}
	public int getTotalCount()
	{
		return totalCount;
	}
	public void setTotalCount(int totalCount)
	{
		this.totalCount = totalCount;
	}
		
}
