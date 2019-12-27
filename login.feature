Feature: Free CRM Login Feature

   without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "tripathy.rojaleen@gmail.com" and "10April@91"
#Then user clicks on login button
#Then user is on home page


#with Examples Keyword
   Scenario Outline: Free CRM Login Test Scenario

      Given User is already on login page
      When title of login page is Free CRM
      Then user enters "<username>" and "<password>"
      Then user clicks on login button
      Then user is on home page
      Then Close the browser


      Examples:
         | username | password |
         | tripathy.rojaleen@gmail.com  | 10April@91 |
         |  omprasadtripathy576@gmail.com     | 10April@91  |