package com.crimeanalysis.app.beans;

public class ByTypeAnalysis
{

	
	private String crimeType;
	private int totalCount;
	public ByTypeAnalysis(String crimeType, int totalCount)
	{
		super();
		this.crimeType = crimeType;
		this.totalCount = totalCount;
	}
	public String getCrimeType()
	{
		return crimeType;
	}
	public void setCrimeType(String crimeType)
	{
		this.crimeType = crimeType;
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
