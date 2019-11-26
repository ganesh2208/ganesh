
Feature: Working of calculator
  Tests the fuctionality of the calculator

  @tag1
  Scenario: Add two numbers
    Given I enter 50 in the calculator
    Then  I press add
    And   I enter 70
    When I press equals button   
    Then The result should be 120 on the screen 
    
    
    

