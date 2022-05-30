@SmokeTest
Feature: Registration | User could Sign Up  with valid data
  Scenario Outline: User Could sign up with valid data
    Given User Click on Register Link
    When User Could Select His Gender
    And User Could Enter His Name
    And User Could Select His Date of Birth
    And User Could Enter Valid Email "<email>"
    And User Could Enter Company Name
    And User Could Enter Password 2 times "<password>"
    And User Could Click on Register Button
    Then User could Sign Up successfully
    Examples:
      | email         | password |
      | Test@test.com | Q1w2e3r4 |