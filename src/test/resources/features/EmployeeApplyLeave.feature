Feature:
  Description:
  As an Employee
  I want to Login as Employee
  so that I can see Employee Apply Leave Page

  Scenario: Verify Employee Apply Leave Form
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Employee Login Menu
    And I Enter Employee User Id
    And I enter Employee Password
    When I click on Employee Login button
    Then I click on Apply Leave menu
    Then I write the Reason
    Then I put start Date
    Then I put End Date
    When I click on Submit Button
    Then Verify Apply leave



