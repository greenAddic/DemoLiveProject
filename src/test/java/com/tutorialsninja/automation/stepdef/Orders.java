package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.SearchPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders {
	
	HeadersSection headerssection = new HeadersSection();
	LoginPage loginpage = new LoginPage();
	SearchPage searchpage = new SearchPage();
	ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
	Browser browser = new Browser();	
	
	@Given("^i login into the page$")
	public void i_login_into_the_page() {
	    
		Browser.openApplicationUrl();
		HeadersSection.navigateToLoginPage();
		LoginPage.doLogin();
		
	}

	@And("^i add a product to bag and checkout$")
	public void i_add_a_product_to_bag_and_checkout() {
		
		SearchPage.searchProduct();
		SearchPage.firstProduct();
		SearchPage.navigatetoshoppingcart();
		ShoppingCartPage.navigatetocheckoutpage();
		
	}

	@When("^i place an order$")
	public void i_place_an_order() throws Throwable {
	    
	}

	@Then("^i should see the order placed successfully$")
	public void i_should_see_the_order_placed_successfully() throws Throwable {
	   
	}
}
