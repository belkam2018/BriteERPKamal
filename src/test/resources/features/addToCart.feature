Feature: Add to cart and verify Error

  @script2
  Scenario: Verify that you cannot add more product in cart than the product available in store

    Given I am on home page
    Then click on MOBIL menu
    And click on ADD TO CART button
    When change QTY value to one thousand
    Then click UPDATE button
    And verify the error message
    Then click on EMPTY CART
    And verify cart is empty