@Login
  Feature: Login
    As a user
  I want to access my profile account
  So that i can access my profile

  Scenario Outline: POST - Login
    Given I set an endpoint for login user
    And I input "<email>" with "<password>"
    When I request detail account email user
    Then validate status code is <status_code>
    And validate the "<message>" after request login
    And get token if "<message>" for other request
    Examples:
      |email              |password |status_code |message  |
      |rayhan13           |rayhan13 |200         |success  |
      |ray                |han      |400         |required |