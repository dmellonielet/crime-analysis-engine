package com.crimeanalysis.app.db.dao;

import java.util.ArrayList;

import com.crimeanalysis.app.beans.AnalysisRequest;
import com.crimeanalysis.app.beans.ByTypeAnalysis;

public class ByTypeAnalysisDAO
{

	
	public ArrayList<ByTypeAnalysis> getAnalysis(AnalysisRequest analysisRequest)
	{
		
		
		ArrayList<ByTypeAnalysis> temp=new ArrayList<ByTypeAnalysis>();
		temp.add(new ByTypeAnalysis("Rape",336));
		temp.add(new ByTypeAnalysis("Murder",336));
		
		return temp;
		
		
	}
	
	
}
