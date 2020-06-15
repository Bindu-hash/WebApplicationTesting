package com.RunCuke;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\Bindu Reddy\\Desktop\\SeleniumTesting\\Cucumber\\src\\com\\Features\\OHRM.feature"},glue={"com.StepDefinition"},monochrome=true)


public class TestRunner 
{
   
}
