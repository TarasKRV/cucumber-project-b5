Feature: Practice soft assertions

  @soft
  Scenario: Soft assertion practice
    Given user is on Docuport login page
    Then user validates "Login" text is displayed login
    Then user validates "Docuport" text is displayed docuport
    When user inserts "b1g1_client@gmail.com" to "username" field on "Login" page
    When user inserts "Group1" to "password" field on "Login" page
    And user clicks "Login" button on "Login" page
    And user validates "Choose account" text is displayed choose
    And user clicks "continue" button on "Choose account" page
    Then user should be able to see the home for client
    And user clicks "Received Doc" button on "Left Navigate" page
    And user clicks "Search" button on "Received Doc" page
    And user inserts "tax document" to "Document name" field on "Received Doc" page
