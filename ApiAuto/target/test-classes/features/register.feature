@Register
  Feature: Register
    As a user
  I want to register my account
  so that i can access website with my account

  Scenario Outline: POST- Register
  Given I set an endpoint for register user
    When I input "<fullname>" with "<Email>" with "<Password>"
    And I request detail account user
    Then I validate status code is <statuscode>

    Examples:
    |fullname|Email|Password|statuscode|
    |rayhanfoid  |rayhan48|rayhan48|200    |
    |rayhan  | rayhan48gmai.com       |rayhan48  |400    |

