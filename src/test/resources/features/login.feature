@login
Feature: Login

  Scenario: Login - happy flow
    Given user wants to sign in
    When user enters valid username
    And user enters valid password
    And clicks on login button
    Then I validate that user is logged in
