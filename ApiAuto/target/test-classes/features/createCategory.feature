Feature: Create Category
  As an User
  I want to post categories
  So that I can create categories


Scenario Outline: POST - Categories Create Category
Given I set an endpoint for create category
When I input "<name>"
And I request detail category
Then I validate <statusCode>
  Examples:
  |name|statusCode|
  |X  |200       |
  |    |500      |
  |2   |200       |