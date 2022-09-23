Feature: Search funtionality scenarios

@Search @One
Scenario: Verify whether the user is able to search for the products
	Given i launch the page
	When i search for the product "samsung sync master 941bw"
	And i click on the search button
	Then i should see the searched product 
	
@Search @Two
Scenario: Verify whether the user is not able to search for the product
	Given i launch the page
	When i search for the product "apple iphone"
	And i click on the search button
	Then i should see the non-searched product message 