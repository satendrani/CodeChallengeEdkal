#This feature file will test search functionality and add to kart
#Author: Satendra Dixit
Feature: validate search product on amazon

  @UI_Test
  Scenario: To verify search functionality
    Given Open browser and luanch the website
    When Enter the text Headphones in the search box Hit enter
    Then From the results displayed on page add all the items marked as Best seller to the cart
