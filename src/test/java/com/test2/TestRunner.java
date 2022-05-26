package com.test2;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.ReportGeneration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features1",glue="com.test3",dryRun=false, 
plugin= {"pretty","json:Cucumberdemo\\Report\\rep.json"},monochrome=true,tags="@E2E"	)
	public class TestRunner {		
		
	@AfterClass
	public static void afterclass() {
		// TODO Auto-generated method stub
ReportGeneration.generateJvmReport("json:rep.json");
	}
}


