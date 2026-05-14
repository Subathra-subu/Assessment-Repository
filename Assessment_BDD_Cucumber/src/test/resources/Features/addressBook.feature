Feature: Address Book Feature

  Scenario: Add address using data table

    Given User is logged into the application
    When User adds a new address with following details
      | firstname | John            |
      | lastname  | Doe             |
      | address1  | 123 Main Street |
      | city      | Chennai         |
      | postcode  | 600001          |
      | country   | India           |
      | region    | Tamil Nadu      |
    Then Address should be added successfully