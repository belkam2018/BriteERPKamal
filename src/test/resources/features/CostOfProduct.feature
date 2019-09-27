Feature: Verify Cost of Product

  @script1
  Scenario: Verify that cost of product in list page and details page are equal

    Given I am on home page
    Then click on MOBIL menu
    And read the cost of Sony Experia the value
    Then click on Sony Experia mobile
    And read the Sony Experia from details page
    Then compare value and detail page