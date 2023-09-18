@Customer
Feature: Customer Login Functionality
  Description:
  As a Customer
  I want to Login as Customer
  So that I can see Customer Home page

  Scenario: Verify Customer Login Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter Customer User Id
    And I enter Customer Password
    When I click on Customer Login button
    Then Verify I am in Customer Home Page
