@OpenSauceDemo
  Feature: SauceDemo
    Scenario: Login to Sauce Demo HomePage
      Given the user is on Sauce Demo Home Page
      When the user clicks on the Sauce Labs Backpack ADD TO CART on the home page
      Then the user should see the Sauce Labs Backpack added to the card
