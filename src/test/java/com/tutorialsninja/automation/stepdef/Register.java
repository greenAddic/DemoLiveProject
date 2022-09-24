package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Register {
	
	HeadersSection headersection = new HeadersSection();
	RegisterPage registerpage = new RegisterPage();
	AccountSuccessPage accountsuccesspage = new AccountSuccessPage();
	
	@Given("^i launch the page$")
	public void i_launch_the_page() {
		
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^i navigate to Account registration page$")
	public void i_navigate_to_Account_registration_page() {
	
		Elements.click(HeadersSection.myAccountLink);
		
		Elements.click(HeadersSection.register);
		
	}

	@When("^i provide all the details below$")
	public void i_provide_all_the_details_below(DataTable datatable) {
		
		RegisterPage.enterAllDetails(datatable, "unique");
		
	}

	@And("^i click on privacy policy$")
	public void i_click_on_privacy_policy() {
	    
		Elements.click(RegisterPage.agree);
	
	}

	@And("^i click on continue button$")
	public void i_click_on_continue_button() {
	   
		Elements.click(RegisterPage.submit);
	}

	@Then("^I should see the user account has successfully created$")
	public void i_should_see_the_user_account_has_successfully_created() {
	    
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successbreadcrumb));
				
	}

	@Then("^I should see the user account is not successfully created$")
	public void i_should_see_the_user_account_is_not_successfully_created() {
	    
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerbreadcrumb));
		
	}

	@And("^i should see the warning message informing the user to fill mandatory fields$")
	public void i_should_see_the_warning_message_informing_the_user_to_fill_mandatory_fields() {
	   
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstnamewarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastnamewarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailwarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephonewarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.inputpasswordwarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainwarning));
	}

	@And("^i subscribe to newsletter$")
	public void i_subscribe_to_newsletter() {
		
		Elements.click(RegisterPage.subscribe);
		
	}
	
	@When("^i provide all the duplicate details below$")
	public void i_provide_all_the_duplicate_details_below(DataTable datatable){
	
		RegisterPage.enterAllDetails(datatable,"duplicate");
		
	}
	
	@Then("^I should see the user account is restricted to create duplicate account$")
	public void i_should_see_the_user_account_is_restricted_to_create_duplicate_account() {
	    
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainwarning, "Warning: E-Mail Address is already registered!"));
		
	}

}
