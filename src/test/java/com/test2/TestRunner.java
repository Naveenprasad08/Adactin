package com.test2;


import org.junit.runner.RunWith;

import com.report.ReportGeneration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features1",glue="com.test3",dryRun=false)
	public class TestRunner {		
		
	
}


