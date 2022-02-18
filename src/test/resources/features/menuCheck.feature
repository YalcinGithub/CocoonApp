Feature:

  Background: user open the webpage

    When the user goes to page
    Then the user should be able to view Dashboard
  @smoke
  Scenario: check the menu
    Then the user should be able to view menu
      | Management       |
      | Stock Management |
      | Invoices         |
      | Reporting        |
      | Administration   |
