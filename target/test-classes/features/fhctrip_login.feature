@fhclogin
Feature: Login feature
  Background:TC01_user logins with valid credentials
    Given user is on the fhctriplogin page

    And user enters valid username
    And user enters  valid password
    And user clicks login button
    Then verify login is successfull



    And user enters invalid username
    And user enters  invalid password
    And user clicks login button
    Then verify login is not successfull