@Login
Feature: Login
  As a user
  I want to login in AltaShop
  So that I can access AltaShop


  Scenario Outline: Login scenario
    Given I am on the login page
    When I input "<email>" email
    And I input "<password>" password
    And click login button
    Then I get the "<result>"
    Examples:
      |       email      |password|result    |
      |imamrayhanekadinataa@gmail.com                |rayhan1234       |home page |
      |imamrayhanekadinataa@gmail.com                  |bocahtampan|login page|
      |iniiseng@yahoo.com| rayhan1234       |login page|
      |a                 |  b     |login page|


