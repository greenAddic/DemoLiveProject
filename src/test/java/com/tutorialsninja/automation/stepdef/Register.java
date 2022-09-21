package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Register {
	
	@Given("^i launch the page$")
	public void i_launch_the_page() {
		
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^i navigate to Account registration page$")
	public void i_navigate_to_Account_registration_page() {
	
	}

	@When("^i provide all the details below$")
	public void i_provide_all_the_details_below(DataTable datatable) {
	    
	}

	@And("^i click on privacy policy$")
	public void i_click_on_privacy_policy() {
	    
	}

	@And("^i click on continue button$")
	public void i_click_on_continue_button() {
	   
	}

	@Then("^I should see the user account has successfully created$")
	public void i_should_see_the_user_account_has_successfully_created() {
	    
	}


}
