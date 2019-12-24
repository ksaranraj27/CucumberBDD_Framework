
Feature: FreeCRM login feature

#without Example keyword
 # Scenario: FreeCRM login test scenario
 #   Given user is on login page
 #   When title of the login page
#    Then user enters "naveenk" and  "test@123"
#    Then user clicks on login button
#    Then user is on HomePage

    
 #With Example Keyword   
Scenario Outline: FreeCRM login test scenario
    Given user is on login page
    When title of the login page
    Then user enters "<username>" and  "<password>"	
    Then user clicks on login button
    Then user is on HomePage
    Then user close the browser
    
    Examples:
    | username | password |
    | naveenk    | test@123 |
    | nak    | test123   |
    
    