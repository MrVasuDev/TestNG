Feature: Checking the functionality of add employee

	@functional
  Scenario Outline: verify the add employee with valid data
    #Given open Browser
    Given enter url
    And user clicks on pim and add
    When User enter <FirstName> and <LastName>
    And user can upload photo
    And user clicks on save
    Then user should get successful message

    Examples: 
      | FirstName | LastName |
      | Naruto    | Ozumaki  |
