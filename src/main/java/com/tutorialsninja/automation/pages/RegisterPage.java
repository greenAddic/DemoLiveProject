package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {

	public RegisterPage(){
		
		PageFactory.initElements(Base.driver, this);
				
	}
	@FindBy(id="input-firstname")
	public static WebElement firstname;
	
	@FindBy(id="input-lastname")
	public static WebElement lastname;
	
	@FindBy(name="email")
	public static WebElement email;
	
	@FindBy(name="telephone")
	public static WebElement telephone;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(name="confirm")
	public static WebElement confirm;
	
	@FindBy(name="agree")
	public static WebElement agree;
	
	@FindBy(css="input[type=\"submit\"]")
	public static WebElement submit;
	
	@FindBy(linkText="Register")
	public static WebElement registerbreadcrumb;
	
	@FindBy(css="input[id=\"input-firstname\"]+div")
	public static WebElement firstnamewarning; 
	
	@FindBy(css="input[id=\"input-lastname\"]+div")
	public static WebElement lastnamewarning; 
	
	@FindBy(css="input[id=\"input-email\"]+div")
	public static WebElement emailwarning; 
	
	@FindBy(css="input[id=\"input-telephone\"]+div")
	public static WebElement telephonewarning; 
	
	@FindBy(css="input[id=\"input-password\"]+div")
	public static WebElement inputpasswordwarning; 
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainwarning;
	
	@FindBy(name="newsletter")
	public static WebElement subscribe;
	
	public static void enterAllDetails(DataTable datatable, String duplicate) {
		
		Map<String,String> map = datatable.asMap(String.class,String.class);
		
		Elements.TypeText(RegisterPage.firstname, map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastname, map.get("LastName"));
		Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPage.password,map.get("Password"));
		Elements.TypeText(RegisterPage.confirm, map.get("Password"));
		
		if(duplicate.equalsIgnoreCase("duplicate"))
			Elements.TypeText(RegisterPage.email, map.get("Email"));
		else
			Elements.TypeText(RegisterPage.email, System.currentTimeMillis()+map.get("Email"));
	    
	}
	
}

