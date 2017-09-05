Feature: Data Coverage Checks
  To ensure that the app accepts data that is required by the agencies to perform
  their jobs.

  @psm-2.9
  Scenario: Captures Contact Info for Organization
    Given I have started an enrollment
    When  I move to the organization page
    Then I should be asked to enter Applicant Name, Contact Person, Contact phone

  @psm-2.9
  Scenario: Captures Medicaid number for Organization's contact
    Given I have started an enrollment
    When  I move to the organization page
    Then I should be asked to enter Medicaid number

  @psm-2.9
  Scenario: Captures Contact Info for Individual
    Given I have started an enrollment
    When  I move to the personal info page
    Then I should be asked to enter Applicant Name, Contact Person

  @psm-2.9
  Scenario: Captures Phone number and Medicaid number for Individual
    Given I have started an enrollment
    When  I move to the personal info page
    Then I should be asked to enter Contact phone, Medicaid number

  @issue-362
  Scenario: Captures Individual Beneficial Owner's City
    Given I have started an enrollment
    And I am entering ownership information
    And I have indicated that the owner has an interest in another Medicaid disclosing entity
    And I have entered a city for that other entity
    When I click 'next' on the Ownership Info Page
    Then the city should be accepted

