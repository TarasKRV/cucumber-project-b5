@google_search
Feature: Google Search Functionality Title Validation
  User story: As a user when I am on the Google search page
  I should be able to search whatever i want and see result


  Scenario: Search functionality result title validation
    Given user is on Google search page
    When user types Loop Academy in the Google search box and click enter
    Then user should be able to see Loop Academy - Google search in the google title



  Scenario: Search functionality result title validation
    Given user is on Google search page
    When user types "Feyruz" in the Google search box and click enter
    Then user should be able to see "Feyruz - Google Search" in the google title

  Scenario: Search functionality result title validation
    Given user is on Google search page
    When user types "Taras" in the Google search box and click enter
    Then user should be able to see "Taras - Google Search" in the google title