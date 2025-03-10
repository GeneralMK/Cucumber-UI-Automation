Feature: Add Product to cart
  Background: A user need to be able to add a product to cart and verify that the added the product

    Scenario: Adding a product
      Given I am on the home page and I search the product "Samsung 303L Bottom Freezer With Water Dispenser And Cool Pack" on the search bar
      When I click the search icon i see a list of products
      Then I select the product "Samsung 303L Bottom Freezer With Water Dispenser And Cool Pack | Shop Today. Get it Tomorrow! | takealot.com"
      Then I am on the product page and I the click add to cart button
      Then I verify that "Samsung 303L Bottom Freezer With Water Dispenser And Cool Pack" added in the cart

