Feature: Create Account and Login

  @script3
  Scenario: Verify you can create account in E-commerce site and can share wishlist to other people using email


    Given Create account link and fill new User
    And Click register
    And Verify registration is done
    Then go to TV menu and Add product in wish list
    And Click SHARE WISHLIST
    Then Check wishlist is shared