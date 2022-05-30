@SmokeTest
Feature: WishList | User could add products to wishlist
  Scenario: User Could add a product to wishlist
    When User Add a Product to wishlist
    Then WishList Notification Displayed

    Scenario: Number of items in WishList Increase after adding a product
      When User Add a Product to wishlist
      Then WishList Notification Displayed
      And User Get Number of items in wish List After Adding a Product
      Then Number of WishList Items Increased
      And User Go to WishList page
      And Count Numbers of quantities


