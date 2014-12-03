package com.crimeanalysis.app.db.dao;

import java.util.ArrayList;

import com.crimeanalysis.app.beans.AnalysisRequest;
import com.crimeanalysis.app.beans.ByDayAnalysis;
import com.crimeanalysis.app.util.DateUtil;

public class Test
{

	public static void main(String[] args)
	{
		AnalysisRequest an=new AnalysisRequest();
		an.setRadius(0.25);
		an.setLat(40.747257);
		an.setLon(-111.888683);
		an.setStartDate(DateUtil.convert("01-11-2001"));
		an.setEndDate(DateUtil.convert("01-11-2014"));
		
		ByDayAnalysisDAO dao=new ByDayAnalysisDAO();
		ArrayList<ByDayAnalysis> result=dao.getAnalysis(an);
		
		System.out.println(result);
	}

}