@OpenRCM
  Feature: RCMTestDemo
    Scenario: Login to RCM HomePage
      Given user is on RCM HomePage
      When the user the user clicks on the log out link on the home page
      Then the user should see the saved login time in database

#@OpenMRS
#  Feature: CucumberTestDemo
#    Scenario: Search a patient record on Find a Patient Page
#      Given user has logged into OpenMRS application
#      When user clicks on Find Patient Record on home page
#      And user enters "teste1" in the search box on find patient page
#      Then user should be able to see the "teste1" medical history