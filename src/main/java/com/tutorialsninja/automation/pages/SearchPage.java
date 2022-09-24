package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

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
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement addtocart;
	
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	public static WebElement shoppingcart;
	
	public static void searchProduct() {
		
		Elements.TypeText(search, Base.reader.getProduct());
		Elements.click(searchbutton);
		
	}
	
	public static void firstProduct() {
		
		Elements.click(addtocart);
		
	}
	
	public static void navigatetoshoppingcart() {
		
		Elements.click(shoppingcart);
	}
	
}
