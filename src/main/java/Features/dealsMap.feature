Feature: FreeCRM login feature
  
  without Example keyword

  Scenario: FreeCRM login test scenario
    Given user is on login page
    When title of the login page
    Then user enters  username and  password
      | username | password |
      | naveenk  | test@123 |
      
    Then user clicks on login button
    Then user is on HomePage
    Then user move to deal page
    Then user enter deal details
      | title    | amount | probability | commission |
      | sandeal  |   1000 |          50 |       10 |
      | sandeal1 |   2000 |          50 |       20 |
      | sandeal2 |   3000 |          50 |       30 |
      | sandeal3 |   4000 |          50 |       40 |
      
    Then user close the browser
