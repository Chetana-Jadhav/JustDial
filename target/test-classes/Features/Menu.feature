Feature: Menu Related Test Cases

  @SideMenuLinks
  Scenario Outline: 7. User is able to navigate to left side menu links to navigate to various categories
    Given User navigates to the application url "https://www.justdial.com/"
    When User clicks on "<SIDE_MENU_LINK_NAME>"
    Then User is navigates to the corresponding link related to "<SIDE_MENU_LINK_NAME>"

    Examples:
      |SIDE_MENU_LINK_NAME|
      |Baby Care     |
      |Bus           |
      |Medical       |
      |Real Estate   |
      |Travel        |
      |Wedding       |