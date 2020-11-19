@fhctripregister
Feature: FhcTrip Registration
  Scenario: fhcTrip registration test
    Given user on the fhctrip homepage
    And user clicks "a create new account" button
    And user enters username
    And user enters password
    And user enters email
    And user enters fullname
    And user enters phone
    And user enters SSN
    And user enters driving licence
    And user selects country from country dropdown
    And user selects state from country dropdown
    And user enters address
    And user enters working sectors
    And user enters birthday
    Then user clicks save button