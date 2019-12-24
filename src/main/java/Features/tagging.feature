
Feature: FreeCRM application testing

  @smoke  @Regression
  Scenario: Login with correct username and correct password
    Given This is a valid login test

  @Regression
  Scenario: Login with incorrect username and correct password
    Given This is a invalid login test

  @E2E
  Scenario: create a contact
    Given This is create contact testcase

 @Regression
  Scenario: create a deal
    Given This is a create deal testcase
@smoke
  Scenario: create a task
    Given This is a create task testcase
@smoke
  Scenario: create a case
    Given This is a create case  testcase
@smoke @Regression @E2E
  Scenario: verify left panel links
    Given clicking on left panel links

@Regression @E2E
  Scenario: search  a deal
    Given This is a create search deal testcase
@Regression @E2E
  Scenario: search  a contact
    Given This is a create search contact testcase
@smoke @Regression
  Scenario: search  a case
    Given This is a create search case  testcase
@Regression
  Scenario: search  a task
    Given This is a create search task  testcase
@Regression
  Scenario: search  a call
    Given This is a create search call  testcase
@Regression
  Scenario: search  a email
    Given This is a create search email  testcase
@smoke @Regression
  Scenario: search  a docs
    Given This is a create search docs  testcase
@Regression
  Scenario: search  a forms
    Given This is a create search forms  testcase
@smoke
  Scenario: search  a report
    Given This is a create search report  testcase
@smoke @Regression @E2E
  Scenario: application logout
    Given This is a logout  testcase
