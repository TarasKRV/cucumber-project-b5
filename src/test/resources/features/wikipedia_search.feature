Feature: Wikipedia Search Functionality
  User story: As a user when I am on the Wikipedia search page
  I should be able to search whatever i want and see result




 Background: this is for Wikipedia search page
   Given user is on Wikipedia search page
   And user searching the following item
   And user click on search button

  @wiki_page
  Scenario: Searching multiple items about Steve Jobs
       Then user should be able to see Steve Jobs is in the wiki title

  @wiki_page
  Scenario: Searching multiple items about Steve Jobs
      Then user should be able to see Steve Jobs is in the main header

  @wiki_page
  Scenario: Searching multiple items about Steve Jobs
      Then user should be able to see Steve Jobs is in the image header



