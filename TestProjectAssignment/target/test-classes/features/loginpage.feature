Feature: check login functionality

  Scenario: check login is successful with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

Feature: Login with successful and Unsuccessful logins

  Scenario: Open Gmail Link and Login
    Given the user opens a web browser
    And the user navigates to "https://www.gmail.com/"
    When user logged in using Username as "username" and Password as"password"
    And click on login button
    Then user navigate to the Home page of gmail
    
	Scenario:  Unsuccessful Login with Invalid entries
		Given user navigates to the website gmail.com
		When username is incorrect, but the password is correct
		When username is correct, but the password is incorrect
		Then login must be unsuccessful.
    

Feature: Login and send gmail and logout
    
  Scenario: user logs in and send gmail
  	Given User who visit gmail login page
  	And User login with Username "sumanas1230@gmail.com" and Password "12345"
  	When User send an gmail to "sumanas3012@gmail.com" with Subject "Automation Testing"
  	And The gmail opens in the sent foulder of gmail with subject "Automation Testing"
  	Then Cick on logout button
    
