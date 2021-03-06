package com.revature.automation;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithdrawTest {

	/*
	 * Step implementations.. what we execute for each Given, When, Then
	 */

	@Given("^I input my pin$")
	public void i_input_my_pin() throws Throwable {
		System.out.println("Given I input my pin");
	}

	@Given("^I have (\\d+) in my account$")
	public void i_have_in_my_account(int arg1) throws Throwable {
	    System.out.println("Given I have " + arg1 + " in my account");
	}
	
	@Given("^I entered my card$")
	public void i_entered_my_card() throws Throwable {
	    System.out.println("Given I entered my card");
	}

	@When("^I withdraw (\\d+) doll hairs$")
	public void i_withdraw_doll_hairs(int arg1) throws Throwable {
	    System.out.println("When I withdraw " + arg1 + " dollerzes");
	}

	@Then("^I have (\\d+) doll hairs left$")
	public void i_have_doll_hairs_left(int arg1) throws Throwable {
	    System.out.println("Then I have $$" + arg1 + " dollhairs left");
	    Assert.fail();
	}
	
}
