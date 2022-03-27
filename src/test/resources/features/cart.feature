@cart
Feature: add to cart feature

  Scenario: add first product to cart
    Given user is on "My Store" page
    When user searches "casual dresses"
    And  user clicks on search icon
    Then user is navigated to "Search" page
    And searched products exist
    When user adds product item to cart
    Then Message "Product successfully added to your shopping cart" appears on screen
    And user continues shopping

  Scenario: remove product from cart
    Given user is on "My Store" page
    When user searches "casual dresses"
    And  user clicks on search icon
    Then user is navigated to "Search" page
    And searched products exist
    When user adds product item to cart
    Then Message "Product successfully added to your shopping cart" appears on screen
    And user continues shopping

    And user goes to cart
    And user check if cart has products
    When user deletes first product
    Then Empty warning message should appear

  Scenario: checkout from cart
    Given user is on "My Store" page
    When user searches "casual dresses"
    And  user clicks on search icon
    Then user is navigated to "Search" page
    And searched products exist
    When user adds product item to cart
    Then Message "Product successfully added to your shopping cart" appears on screen
    And user continues shopping

    When user goes to cart
    And user check if cart has products
    And user clicks next to proceed to checkout - Summary

    When user enters valid username
    And user enters valid password
    And clicks on login button
    Then I validate that user is logged in

    And user clicks next to proceed to checkout
    When user agrees the terms and conditions
    And user clicks next to proceed to checkout
    Then user is navigated to "Order" page
    And user selects bank wire payment method
    And user confirms order


#  @checkout
#  Scenario: checkout from cart
#    Given user is on "My Store" page
#    And user wants to sign in
#    When user enters valid username
#    And user enters valid password
#    And clicks on login button
#    Then I validate that user is logged in
#
#    When user goes to cart
#    And user check if cart has products
#    And user clicks next to proceed to checkout
#    And user clicks next to proceed to checkout
#    When user agrees the terms and conditions
#    And user clicks next to proceed to checkout
#    Then user is navigated to "Order" page
#    And user selects bank wire payment method
#    And user confirms order

