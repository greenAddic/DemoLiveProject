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