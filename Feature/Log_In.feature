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

Feature: Login Action
	I want to use this template for my feature file


Scenario: Successful Login with valid Credentials
Given User is on Home Page
When 	User Navigate to Login Page
And 	User enters Credentials to LogIn
		| Username   | Password |
    	| tuan 		 | VVlzJNLBtp5keqh( |
Then 	Message displayed Login successfully

Scenario: Successful Log Out
When User Log Out from the application
Then Message displayed Log Out successfully

