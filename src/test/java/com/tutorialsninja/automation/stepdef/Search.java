package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.SearchPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Search {

	SearchPage searchpage = new SearchPage();
	
	@When("^i search for the product \"([^\"]*)\"$")
	public void i_search_for_the_product(String product) {
	   
		Elements.TypeText(SearchPage.search, product);
		
	}

	@And("^i click on the search button$")
	public void And_i_click_on_the_search_button() {
		
		Elements.click(SearchPage.searchbutton);
		
	}
	
	@Then("^i should see the searched product$")
	public void i_should_see_the_searched_product() {
	    
		Assert.assertTrue(Elements.isDisplayed(SearchPage.searchedproduct));
		
	}
	
	@Then("^i should see the non-searched product message$")
	public void i_should_see_the_non_searched_product_message() {
	    
		Assert.assertTrue(Elements.isDisplayed(SearchPage.noproductmessage));
		
	}
}
