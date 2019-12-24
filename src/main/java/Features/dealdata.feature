

Feature: FreeCRM login feature

without Example keyword
  Scenario: FreeCRM login test scenario
    Given user is on login page
    When title of the login page
    Then user enters  username and  password
    |naveenk | test@123|
    Then user clicks on login button
    Then user is on HomePage
    Then user move to deal page
    Then user enter deal details
    | sandeal | 1000 | 50 | 10 |
    Then user close the browser