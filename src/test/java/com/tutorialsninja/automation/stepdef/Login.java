package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgottenPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {

	HeadersSection headersection = new HeadersSection();
	LoginPage dologin = new LoginPage();
	MyAccountPage myaccountpage = new MyAccountPage();
	ForgottenPasswordPage forgottenpasswordpage = new ForgottenPasswordPage();
	
	@And("^i navigate to login page$")
	public void i_navigate_to_login_page() {
		
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.login);
		
	}

	@When("^i enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String email, String password) {
	  
		LoginPage.doLogin(email, password);
		
	}
	
	@Then("^i should see the user is able to successfully login into the page$")
	public void i_should_see_the_user_is_able_to_successfully_login_into_the_page() {
		
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.loginsuccessful));
		
	}

	@Then("^i should see the user is not able to successfully login into the page$")
	public void Then_i_should_see_the_user_is_not_able_to_successfully_login_into_the_page() {
		
		Assert.assertTrue(Elements.isDisplayed(LoginPage.warning));
		
	}
	
	@And("^i click on forgotten password$")
	public void i_click_on_forgotten_password() {
	    
		Elements.click(LoginPage.forgottenpassword);
		
	}

	@Then("^i should see forgotten password page$")
	public void i_should_see_forgotten_password_page() {
	    
		Assert.assertTrue(Elements.isDisplayed(ForgottenPasswordPage.forgotpassword));
		
	}
	
	@Then("^i should see email confirmation page$")
	public void i_should_see_email_confirmation_page() {
	    
		Assert.assertTrue(Elements.isDisplayed(LoginPage.emailconfirmation));
		
	}


}

