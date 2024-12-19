
Feature: checking the functionality of login module

 @smoke
  Scenario Outline: Verify user should not login with invalid credentials
    #Given open browser
    Given user enter the url
    And user should enter <un> and <pwd>
      When user clicks on login
    Then toaster message should display 
   

    Examples: 
      | un     | pwd   |
      | Admin1 | admin141|  