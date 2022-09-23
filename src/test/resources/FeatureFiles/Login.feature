Feature: Login feature scenario for the page

@Login @One
Scenario: Verify whether the user is successfully login with valid credentials
	Given i launch the page
	And i navigate to login page
	When i enter username as "personal.9user@yahoo.com" and password as "welcome@1"
	Then i should see the user is able to successfully login into the page

@Login @Two
Scenario: Verify whther the user is not successfully able to login
	Given i launch the page
	And i navigate to login page
	When i enter username as "personal.79user@yahoo.com" and password as "welcome@1"
	Then i should see the user is not able to successfully login into the page
	
@Login @Three
Scenario: Verify whether the user is not successfully able to login without providing the credentials
	Given i launch the page
	And i navigate to login page
	And i click on continue button
	Then i should see the user is not able to successfully login into the page
	
@Login @Four
Scenario: Verify if the user is able to click on forgotten password
	Given i launch the page
	And i navigate to login page
	And i click on forgotten password
	Then i should see forgotten password page

@Login @Five
Scenario: Verify if the user is able to see email confirmation link sent to your address
	Given i launch the page
	And i navigate to login page
	And i click on forgotten password
	And i provide the valid email ID "personal.9user@yahoo.com"in email address field
	And i click on continue button
	Then i should see email confirmation page
	