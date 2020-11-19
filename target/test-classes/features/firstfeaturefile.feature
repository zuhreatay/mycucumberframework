@googlesearch @first
Feature: Google search

  Background: user is on the google page
    Given user is in the google page

  @teapot
  Scenario: user searches teapot in google
    And user searches teapot
    Then verify result has teapot

    @nokia
  Scenario: user searches nokia in google
    And user searches nokia
    Then verify result has nokia