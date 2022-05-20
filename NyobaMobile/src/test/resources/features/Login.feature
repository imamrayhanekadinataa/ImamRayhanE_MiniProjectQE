Feature: Login
  As a user
  I have to be able to login
  So that i can buy products


  Scenario Outline: Login
    Given I am on alta shop application
    When I click logout button on product page
    And I go to login page
    And I input "<email>"
    And Input "<password>"
    And I Click login button
    Then I get the "<result>"
    Examples:
      |email|password|result|
      |imamrayhanekadinataa@gmail.com|rayhan1234|product_page|




