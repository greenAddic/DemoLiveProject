package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {

	public LoginPage(){
		
		PageFactory.initElements(Base.driver, this);
		
	}
	@FindBy(id="input-email")
	public static WebElement emailfield;
	
	@FindBy(id="input-password")
	public static WebElement passwordfield;
	
	@FindBy(css="input[value='Login']")
	public static WebElement login;
	
	@FindBy(className="alert-dismissible")
	public static WebElement warning;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgottenpassword;
	
	@FindBy(className="alert-dismissible")
	public static WebElement emailconfirmation;
	
	public static void doLogin(String email, String password) {
	
		Elements.TypeText(LoginPage.emailfield, email);
		Elements.TypeText(LoginPage.passwordfield, password);
		Elements.click(LoginPage.login);
		
	}
	
}
