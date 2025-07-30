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
Feature: Create New Lead after Login
  
  
#Background:
#Given Launch the browser
#And navigate to the URL

@regression @functional
Scenario Outline: Create new lead with two sets of data      
 Given Enter the Username as 'demosalesmanager'
 And Enter the PAssword as 'crmsfa'
 When Click on the Login Button
# Then Page navigates to Welcome Page
When click on crmsfa link
And click on leads link
And click on createlink lead
Given enter the company name as <companyname>
And enter the firstname <firstname>
And enter the last name <lastname>
When click on the create lead button


Examples:
|companyname|firstname|lastname|
|TCS|Suryalekha|B|
|HCL|subraja|s|