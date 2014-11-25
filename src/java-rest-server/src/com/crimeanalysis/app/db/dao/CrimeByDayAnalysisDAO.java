package com.crimeanalysis.app.db.dao;

import java.util.ArrayList;

import com.crimeanalysis.app.modules.ByDayAnalysis;

public class CrimeByDayAnalysisDAO
{
	
	
		public ArrayList<ByDayAnalysis> getAnalysis()
		{
			
			
			ArrayList<ByDayAnalysis> temp=new ArrayList<ByDayAnalysis>();
			temp.add(new ByDayAnalysis("Mon",336));
			temp.add(new ByDayAnalysis("Tue",213));
			temp.add(new ByDayAnalysis("Wed",355));
			temp.add(new ByDayAnalysis("Thurs",111));
			temp.add(new ByDayAnalysis("Fri",555));
			temp.add(new ByDayAnalysis("Sat",454));
			temp.add(new ByDayAnalysis("Sun",244));
			return temp;
			
			
		}
}
