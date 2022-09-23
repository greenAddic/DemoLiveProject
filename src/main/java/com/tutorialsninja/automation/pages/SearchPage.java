package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class SearchPage {

	public SearchPage() {
		
		PageFactory.initElements(Base.driver, this);
		
	}
	@FindBy(name="search")
	public static WebElement search;
	
	@FindBy(className="btn-lg")
	public static WebElement searchbutton;
	
	@FindBy(linkText="Samsung SyncMaster 941BW")
	public static WebElement searchedproduct;
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	public static WebElement noproductmessage;
	
}
