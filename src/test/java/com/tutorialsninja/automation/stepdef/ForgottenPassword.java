package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgottenPasswordPage;

import cucumber.api.java.en.Given;

public class ForgottenPassword {

	ForgottenPasswordPage forgottenpasswordpage = new ForgottenPasswordPage();
	
	@Given("^i provide the valid email ID \"([^\"]*)\"in email address field$")
	public void i_provide_the_valid_email_ID_in_email_address_field(String email) {
	    
		Elements.TypeText(ForgottenPasswordPage.inputemail, email);
		
	}

}
