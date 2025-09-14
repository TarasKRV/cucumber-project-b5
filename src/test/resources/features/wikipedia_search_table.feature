Feature: Outline Wiki

  @wikipedia_outline
  Scenario Outline:
    Given user is on search page on Wikipedia
    When user searching the "<search item>"
    Then user should be able to see "<results>" as "<title>" on wiki page
    Examples:
      | results      | search item | title                  |
      | title        | Steve Jobs  | Steve Jobs - Wikipedia |
      | main header  | Steve Jobs  | Steve Jobs             |
      | image header | Steve Jobs  | Steve Jobs             |




