@SmokeTest
Feature: Currency | User Could Convert between Currencies
 Scenario: User Could Convert between Currencies to know Product Price
      Given User Check Current Currency
      When User Could Change Value of Current Currency from Select List
      Then User Change Product Price Currency Successfully
