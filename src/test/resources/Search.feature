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
Feature: Amazon Search


@Apple
  Scenario: Search a Product
    Given I have search field on Amazon Page
    When I search a product with name "Apple MacBook Pro" and Price 1000
    Then Procuct with name "Apple MacBook Pro" should be displayed.
    
    @Samsung
     Scenario: Search a Product
    Given I have search field on Amazon Page
    When I search a product with name "Galaxy A12" and Price 2000
    Then Procuct with name "Galaxy A12" should be displayed.
    
    @Nokia
     Scenario: Search a Product
    Given I have search field on Amazon Page
    When I search a product with name "Nokia N19" and Price 3000
    Then Procuct with name "Nokia N19" should be displayed.
