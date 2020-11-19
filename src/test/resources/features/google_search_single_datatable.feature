@datatable @smoketest
Feature: Single Data Table

  Scenario Outline: TC01_ google search test
    Given user is in the google page
    And user searches "<value>"
    Then verify result has "<value>"

    Examples: Test Data
      |value|
      |Selenium|
      |Cucumber|
      |Automation Tester|
      |Istanbul         |



@dress
Scenario: user is on the google page
  Given user is in the google page
  And user search red dress
  Then verify result has red dress





