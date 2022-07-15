Feature: Default

	Background:
		#@B26G7-34
		
		Given user is on the Vytrack login page
		When user enter valid username
		And user enter valid password
		And user click login button
		Then user should be able to see Dashboard title
		


	@B26G7-45
	Scenario: Clicking Rest Button
		When the user navigates to "Fleet" ,"Vehicles"
		    Then User should be able click reset button