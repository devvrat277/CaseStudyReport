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
Feature: SearchEngine feature
  login feature 
  search a product

  @tag1
  Scenario Outline: user should be able to sign in
    Given I want to choose sign in
    When I want to write a step with "<user>"
    And I want to give passwoord with "<pass>"
    Then user should be able to login
    Given I want to search product
    When I want to enter product name "<product>"
    Then I am able to clcik on search

    Examples: 
      | user    | pass        |product|
      | Lalitha | Password123 |Hand   |
     
  

   
      
    
