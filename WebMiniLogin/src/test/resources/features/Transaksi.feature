@Transaksi
  Feature: Transaksi
    As a User
  I want to login to AltaShop
  So that i can see my transaction history

  Scenario Outline: Transaksi
    Given I am on the login pagess
    When I inputd "<email>" email with "<password>" password
    And clickd login button
    And clickd buy button
    And clickd cart button
    And click paid button
    Then I validate to transactions page
    Examples:
      |       email      |password|
     |imamrayhanekadinataa@gmail.com|rayhan1234|
