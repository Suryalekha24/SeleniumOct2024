#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Creation of Account in Salesforce

  @tag1
  Scenario: Salesforce Account creation with Ownership
    Given Enter the username as 'vidyar@testleaf.com'
    And Enter the password as 'Sales@123'
    When Click on Login button
    And Click on Toggle button
    And cick on View All button
    Then Click on Sales in App Launcher
    And click on Accounts tab
    And Click on New button
    And Enter name as 'Suryalekha'
    And Select Ownership as Public
    And Click Save button
    Then Verify Account name has been created

