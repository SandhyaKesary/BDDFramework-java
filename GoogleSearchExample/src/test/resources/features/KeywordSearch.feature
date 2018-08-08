Feature: To search for a keyword in Google

  Scenario Outline: To search for a keyword in Google.com
    Given I am on Google page
    And I search for "<keyword>"
    When I navigate to third link 
    Then I should be redirected to that page successfully
    
    Examples:
    |keyword|
    |Cat|
    |Elephant|
    |Dog|
  
