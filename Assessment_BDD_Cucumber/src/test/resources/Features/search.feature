Feature: Search feature 
Description: This featur file is used to search the products using scenario outline

  Scenario Outline: Search products with different keywords
    Given User is on the home  page
    When User searches for "<keyword>"
    Then Search result should "<result_status>" the keyword

    Examples:
      | keyword | result_status |
      | iPhone  | contain       |
      | Samsung | contain       |
      | exam     | not contain   |