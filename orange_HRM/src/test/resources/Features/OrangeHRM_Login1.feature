Feature: Checking the functionality of login


  Scenario Outline: Verify login with valid credentials
 
    Given enter Url
    When user enter <username> and <password>
    And user clicks on Login
    Then then user navigates to homepage

  Examples:
  
  	|username	|password	|
  	|Admin		|admin123	|