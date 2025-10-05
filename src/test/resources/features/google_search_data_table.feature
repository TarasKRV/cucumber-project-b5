Feature: passing multiple parameters to the same step


  @google_search_data_table @smoke
  Scenario: Searching multiple items
    Given user is on Google search page
    Then user searching the following items
      | items        |
      | Loop Academy |
      | java         |
      | selenium     |
      | sql          |
      | Taras        |
      | Suidim       |
      | Halina       |
      | Taras        |
    And we love Loop Academy