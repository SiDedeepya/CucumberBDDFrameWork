#Keywords in Bdd are Feature, Scenario, Given, When,Then,As, But,*....
#It will execute the stepDefinition according to sequence maintained in login.feature file
Feature: Facebook login Feature


Scenario: Facebook login TestScenario
	Given User is already on login page
	When Title of login page is Facebook
	#Then User enters Username and enters password --->Instead of this line we wrote username and password in feature file to achieve Data driven and hard coded values are removed
	Then User enter "dedeepyajhanu@gmail.com" and enters "Dedeepya123#"
	Then User clicks on Login button
	And User is on Homepage #Validation

#We can write multiple scenarios in a single Feature file	
#Scenario: