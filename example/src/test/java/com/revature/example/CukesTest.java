package com.revature.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={
		"src/test/resources/login.feature"
})
public class CukesTest {

}
