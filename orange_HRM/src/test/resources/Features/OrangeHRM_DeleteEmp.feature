Feature: Checking the functionality of the delete employee

	@functional2
  Scenario Outline: Verify user can delete employee
    Given Enter URL and Login
    When clicks on PIM
    And enter the <empName>
    And clicks on Search
    And clicks on delete
    Then deleted successful should come

    Examples: 
      | empName |
      | Naruto  |
