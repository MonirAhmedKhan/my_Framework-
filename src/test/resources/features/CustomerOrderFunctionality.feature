Feature: CustomerOrderFunctionality
  Description :
  As a Customer
  I want to Login as Employee
  ao that i can see Customer Order Page

  Scenario: Verify Customer Order Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter Customer User Id
    And I enter Customer Password
    When I click on Customer Login button
    Then I click on  Product Order Menu
    When I Choose Customer Product Name
    Then I put Customer Order Date
    Then I click Customer Order Product Button
    When I confirm Customer Order Product
    Then I Verify Customer confirmed Order

