package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Orders.feature"},
glue= {"com.tutorialsninja.automation.stepdef"},
plugin= {"html:target/Cucumber_html_report"},
tags= {"@Order","@One"})
public class Runner {

}
