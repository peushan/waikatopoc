Feature: Facebook Login feature

  Scenario: Login To facebook Pages
  	Given I have open the browser
	When I login to the application using "email" and "password"
	Then Welcome page should be displayed