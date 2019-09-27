Feature: Login to Guru

  @script4
  Scenario: login to account and share wishlist to other people using email

    Given I am on home page
    And Click on my account link
    Then Click to login
    And write email
    And write password
    Then Click on login button
    And Verify registration is done
    Then go to TV menu and Add product in wish list
    And Click SHARE WISHLIST
    Then Check wishlist is shared
