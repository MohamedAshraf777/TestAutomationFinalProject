@SmokeTest
Feature: login | User should be able to login with Valid Credential
    Scenario Outline: User Could Login with valid credentials
    Given User Click on Login Link
    When User Enter Email and Pass= "<Email>" and "<Password>"
    And User Could Click on Login Button
    Then User could login successfully
    Examples:
      | Email         | Password |
      | Test@test.com | Q1w2e3r4 |