package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;





public class ReportGeneration {

	public static void generateJvmReport(String json) {
		File f=new File("Cucumberdemo\\Cucumberdemo\\Report\\rep.json");
		Configuration c=new Configuration(f, "Cucumberdemo");
	c.addClassifications("platform", "win10");
    c.addClassifications("browser", "chrome");
	c.addClassifications("platform", "win10");

	c.addClassifications("sprint", "10");
	
	
	List<String> l=new ArrayList();
	l.add(json);
	
	ReportBuilder builder=new ReportBuilder(l, c);
	builder.generateReports();
	
	}
	
}
