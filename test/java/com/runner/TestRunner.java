package com.runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/resources/customer"}, glue= {"com.fb.stepdefinition"},plugin="html.target")
public class TestRunner {
	

}






