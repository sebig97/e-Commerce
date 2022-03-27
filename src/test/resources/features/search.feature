@search
Feature: Search feature

  Scenario Outline: Search for products
    Given user is on "My Store" page
    When user searches "<product>"
    And  user clicks on search icon
    Then user is navigated to "Search" page
    And searched products exist

    Examples:
    |product        |
    |casual dresses |
    |evening dresses|
    |summer dresses |