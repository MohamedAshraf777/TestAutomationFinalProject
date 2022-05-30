@SmokeTest
Feature: Follow us | Open All Follow Us Links And Switch between Them

  Scenario: User Open Facebook Link
    When User Click on facebook icon
    Then FaceBook is Opened in New tab

  Scenario: User Open Twitter Link
    When User Click on Twitter icon
    Then Twitter is Opened in New tab

  Scenario: User Open Rss Link
    When User Click on Rss icon
    Then Rss is Opened in New tab

  Scenario: User Open YouTube Link
    When User Click on YouTube icon
    Then YouTube is Opened in New tab
