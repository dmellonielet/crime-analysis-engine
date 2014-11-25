package com.crimeanalysis.app.rest;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.glassfish.jersey.server.JSONP;

import com.crimeanalysis.app.db.dao.CrimeByDayAnalysisDAO;
import com.crimeanalysis.app.modules.ByDayAnalysis;

@Path("/analysis")
public class AnalysisByDayREST {

	
	@GET
	@Path("/byDay")
	@JSONP(queryParam="callback")
	@Produces({"application/x-javascript"})
	public ArrayList<ByDayAnalysis> getAllTestData(@QueryParam("callback") String callback) 
	{


		CrimeByDayAnalysisDAO dao=new CrimeByDayAnalysisDAO();

		return dao.getAnalysis();
	    
	}

}