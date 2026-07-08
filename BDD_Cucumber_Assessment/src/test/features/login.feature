@login
Feature: Subathra_08-07-2026_Login Functionality

Scenario Outline: Login Test with multipleInputs
        Given the user launches the DemoWebShop website
        When the clicks the Login link
        And the user enters the email as "<email>" and password as "<password>"
        And the user clicks the login button
        Then the user should see the appropriate message as "<message>" based on the input type as "<type>"

Examples:
    | email                 |password  | message |type|
    | emilydavis@gamil.com  |emilyda   |Log out  |valid|
    | sha@gmail.com         |123456    |The credentials provided are incorrect|invalid|