@register
Feature: Subathra_08-07-2026_Register Functionality

Scenario: Regsiter with valid details
        Given the user launches the DemoWebShop website
        When the clicks the register link
        And the user enters the valid details from csv file
        And the user clicks the register button
        Then the user should see the successfully registered message