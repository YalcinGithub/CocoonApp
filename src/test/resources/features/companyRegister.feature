Feature: sample company register

  Background:
    When the user goes to page
    Then the user should be able to view Dashboard

    Scenario: Create a company
      When the user clicks Company Registration
      Then the user should be able to land the List Company page
      When the user clicks Add Company button
      Then the user should be able to land the Add Company page