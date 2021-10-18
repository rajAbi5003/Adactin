Feature: Book a Room 

Scenario Outline: User wants to login the application
    Given User enters the URL for the application
    When User enters "<UserName>" valid username
    And User enters "<Password>" valid password
    Then Verify username and password to login
		
		Examples:
		|UserName|Password|
		|AAA|111|
		|222|BBB|
		|vinovicky|GMN630|

Scenario: User wants to login the application
    Given User enters the URL for the application
    When User enters "vinovicky" valid username
    And User enters "GMN630" valid password
    Then Verify username and password to login 
    
Scenario: Search for a hotel
    Given A Valid User Account
    When All necessary details are given and submited
    Then Click Submit to redirect to next page
    
Scenario: Enter User Credentials
    Given A redirected site
    When all details are filled and click booked
    Then Booking Successful