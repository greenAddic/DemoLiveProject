Feature: It has all scenarios for the registering a user

@Register @One
Scenario: Verify whether the user is able to register into the application
	Given i launch the page
	And i navigate to Account registration page
	When i provide all the details below
		|FirstName| Shamith									|
		|LastName | Vemula 									|
		|Email		| personal.9user@yahoo.com|
		|Telephone|	015788729002						|
		|Password |	welcome@1								|
	And i click on privacy policy
	And i click on continue button
	Then I should see the user account has successfully created
	
@Register @Two
Scenario: Verify whether the user is able to login if mandatory fields are left blank
	Given i launch the page
	And i navigate to Account registration page
	And i click on continue button
	Then I should see the user account is not successfully created
	And i should see the warning message informing the user to fill mandatory fields
	
@Register @Three
Scenario: verify whether the user is able to resgiter into the applicaiton by subscribing to newsletter
	Given i launch the page
	And i navigate to Account registration page
	When i provide all the details below
		|FirstName| Shamith									|
		|LastName | Vemula 									|
		|Email		| personal.9user@yahoo.com|
		|Telephone|	015788729002						|
		|Password |	welcome@1								|
	And i click on privacy policy
	And i subscribe to newsletter
	And i click on continue button
	Then I should see the user account has successfully created
	
@Register @Four
Scenario: Verify whether the user is creating a duplicate account
	Given i launch the page
	And i navigate to Account registration page
	When i provide all the duplicate details below
		|FirstName| Shamith									|
		|LastName | Vemula 									|
		|Email		| personal.9user@yahoo.com|
		|Telephone|	015788729002						|
		|Password |	welcome@1								|
	And i click on privacy policy
	And i click on continue button
	Then I should see the user account is restricted to create duplicate account
	