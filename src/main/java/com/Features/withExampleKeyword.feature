Feature: Facebook login With Example keyword Feature


Scenario Outline: Facebook login With Example keyword Feature TestScenario
	Given User is present on login page
	When Title of login page is Facebookk
	Then User enter "<username>" and enters "<password>"
	Then User clicks on Login button
	And User is on Homepage #Validation
	
	
Examples:

		|username | password |
		|dedeepyajhanu@gmail.com| Dedeepya123#|
		#we can write how many values we can
	
