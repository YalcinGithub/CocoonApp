Feature:

  Background:
    When the user goes to page
    Then the user should be able to view Dashboard
    When the user clicks Company Registration
    Then the user should be able to land the List Company page
    When the user clicks Add Company button
    Then the user should be able to land the Add Company page

  Scenario: Create a company
   When the user fills out the forms
   And the user clicks Save Changes button
   Then the user should be able to save new company