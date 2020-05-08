package com.mycompany.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	// location of the .feature
	features = "src/test/resources",
	// package name
	glue = "com.mycompany.app",
	// location of json file used for Jenkins
	format = {"json:target/cucumber.json"}
	)

public class CucumberTest{

}