#Feature: Register
#  As a user
#  I should be able to create new account
#  So that i can buy products
#
#
#
#  Scenario Outline: Register
#    Given I am on product page for register
#    When I click logout button
#    And I click register on login page
#    And I input fullname "<Fullname>"
#    And I input email "<Email>"
#    And I input pass "<Password>"
#    And click register button
#    Then I get "<Result>"
#    Examples:
#      |Fullname|Email|Password|Result|
#      |Rayhan     |new|rayhan1234|product_page|
#
