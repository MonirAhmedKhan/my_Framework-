Feature:
  Description:
  As an Customer
  I want to Login as Customer
  so that I can see Customer Profile Info Page

  Scenario: Verify Customer Profile Info
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter Customer User Id
    And I enter Customer Password
    When I click on Customer Login button
    Then I click on Customer Profile menu
    When I click on Update Info Button
    Then I put Contact Number
    Then I put Address
    Then I click on Submit Profile Info