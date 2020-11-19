@facebook
Feature: login in facebook
    Scenario: user is on the facebook page
      Given user is in the facebook page
      And user enters  username
      And user enters   password
      And user enters login
      Then verify result has eslem mina

