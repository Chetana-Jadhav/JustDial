 Feature: Customer Care Related Test Cases
  @CustomerCare
 # Hint: Use Fluent Wait to wait in the Then Step to wait for drop down to appear
 Scenario: 8. User is able to see the drop down in customer care service tab
 Given User navigates to the application url "https://www.justdial.com/"
 And User navigates to Customer care page by clicking on Customer Care tab at the right-mid of the page
 When User enter "online" in the Text box
 Then User is able to see the drop down and all the items in the list must have text as "online"