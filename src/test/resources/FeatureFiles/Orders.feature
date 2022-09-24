Feature: Scenarios below is about placing an order

@Order @One
Scenario: Verify if user is able to place order
	Given i login into the page
	When i add a product to bag and checkout
	And i place an order
	Then i should see the order placed successfully