package com.revature.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 *	Cucumber integrated w/ JUnit
 */
@RunWith(Cucumber.class)
@CucumberOptions(features={
		//"src/test/resources/withdraw.feature",
		//"src/test/resources/register.feature",
		"src/test/resources/login.feature"
})
public class CukesTest {} // hook class





