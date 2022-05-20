@Register
Feature: Register
  As a user
  I want to register in AltaShop
  So that I can access AltaShop Page


  Scenario Outline: Register scenario
    Given I am on the register page
    When I input "<namalengkap>" namalengkap
    And I input "<emails>" emails
    And I input "<password>" password
    And click register button
    Then I get "<result>"
    Examples:
      |namalengkap |       emails      |password|result    |
      |rayhan|New|rayhan12346|login page |
      |rayhanekadinata|rayhanekadinata87@gmail.com|rayhan1234|login page |
      |rayhanekadinata|                  |rayhan1234|register page|
      |Ekadinata|iniiseng@yahoo.com|        |register  page|
      ||                  |        |register page|



