@OpenRCM
  Feature: RCMTestDemo
    Scenario: Login to RCM HomePage
      Given user is on RCM HomePage
      When the user the user clicks on the log out link on the home page
      Then the user should see the saved login time in database
