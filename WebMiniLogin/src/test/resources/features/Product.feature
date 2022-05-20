@Product
  Feature: Product
    As a user
   I want to buy something product
  So that i can have product from AltaShop

  Scenario Outline: Product scenario
    Given I am on the login pagesx
    When I inputx "<email>" email
    And I inputx "<password>" password
    And clickx login button
    And click buy button
    Then I validate in cart shop
    Examples:
      |       email      |password|
      |imamrayhanekadinataa@gmail.com|rayhan1234|