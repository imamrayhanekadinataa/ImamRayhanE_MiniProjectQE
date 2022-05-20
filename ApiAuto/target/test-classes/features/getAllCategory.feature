Feature: Get All Category
  As an User
  I want to get categories
  So that I can get categories detail

  Scenario: GET - All Category
    Given I set an endpoint for get all categories
    When I request GET category list
    Then I validate the status code is 200