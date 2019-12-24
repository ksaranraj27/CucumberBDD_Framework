
Feature: 
 
Scenario Outline: FreeCRM login test scenario
    Given user is on login page
    When title of the login page
    Then user enters "<username>" and  "<password>"	
    Then user clicks on login button
    Then user is on HomePage
    Then user move to contact
    Then user enter "<firstname>" and "<lastname>" and "<position>"
    Then user close the browser
    
    
      Examples:
    | username | password | firstname | lastname | position |
    | naveenk    | test@123 |  saranraj    | kannan    | SDET      |
    | naveenk    | test@123 |  viyan         | vasanth    | CEO      |