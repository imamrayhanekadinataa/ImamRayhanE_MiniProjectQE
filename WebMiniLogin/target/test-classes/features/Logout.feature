@Logout
  Feature: Logout
    As a user
    I want to logout from AltaShop
    So that i can relogin in AltaShop

    Scenario Outline: Logout Scenario
      Given I am on the login pages
      When I inputs "<email>" email
      And I inputs "<password>" password
      And clicks login button
      And I get to home page
      And click profile button
      And click logout button
      Then I validate back to login page
      Examples:
        |       email      |password|
        |imamrayhanekadinataa@gmail.com|rayhan1234|

