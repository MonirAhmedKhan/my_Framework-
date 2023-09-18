Feature: EmployeeOrderFunctionality
  Description:
  As a Employee
  I want to Login as Employee
  so that I can see Employee Order Page


  Scenario: Verify Employee Order Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Employee Login button
    And I Enter Employee User Id
    And I enter Employee Password
    When I click on Employee Login button
    Then I click Product Order Manu
    When I Choose Product Name
    Then I Put Order Date
    Then I click Order Product Button
    When I confirm Order Product
    Then I Verify Employee confirmed Order



