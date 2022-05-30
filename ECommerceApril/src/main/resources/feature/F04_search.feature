@SmokeTest
Feature: Search | User could search for any product
  Scenario Outline: User Could search for products by Name
    Given User Could Write "<product>" in Search Box
    When User Could Click on Search Button
    Then User could Confirm Results of His Search
    Examples:
      | product |
      | Nokia   |

  Scenario Outline: User search for any products by Using SKU
    Given User Could Write "<product>" in Search Box
    When User Could Click on Search Button
    Then User Could Confirm Numbers of items Diplayed
    Examples:
      | product |
      | AP_MBP_13 |
