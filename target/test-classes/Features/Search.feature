Feature: Search Relate Test Cases

  @SearchBar
Scenario: 5. User is able to search the Application
Given User navigates to the application url "https://www.justdial.com/"
When User enters "restaurants" in search text box
And User clicks search button
Then User is able to see search result related to restaurants

    @SearchSuggestion
   # Hint: Use Fluent Wait to wait in the Then Step to wait for drop down to appear
  Scenario: 6. User is able to see the drop down when he keys in the text in the search box
    Given User navigates to the application url "https://www.justdial.com/"
    When User enters "resta" in search text box
    Then User is able to see the drop down under search text box with all the items with text "resta"