Feature: Checking the functionality of the verify employee


	@functional1
  Scenario Outline: Verify the newly added employee
    #Given Open browser
    Given Enter Url
    When clicks on pim
    And user enters <empName>
    And clicks on search
    Then user should get emp details

    Examples: 
      | empName |
      | Naruto ozumaki |
