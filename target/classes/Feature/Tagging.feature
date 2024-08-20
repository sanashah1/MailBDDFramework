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

@FunctionalTest
Feature: Mail application Testing

@SmokeTest @RegressionTest
Scenario: Login with Correct username and password
Given This is a valid login test

@SmokeTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@RegressionTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a new organizer
Given This is a organizer test case

@RegressionTest
Scenario: Create a new mail
Given This is a mail test case

@RegressionTest @End2EndTest
Scenario: Create a case
Given This is a case test case

@RegressionTest
Scenario: Verify header panel links
Given clicking on header panel links

@RegressionTest
Scenario: Verify footer panel links
Given clicking on footer panel links

@SmokeTest @RegressionTest
Scenario: Search a organizer
Given This is a organizer deal test

@SmokeTest 
Scenario: Search a contact
Given This is a search contact test

@RegressionTest
Scenario: Search a case
Given This is a search case test

@SmokeTest @RegressionTest
Scenario: Search an email
Given This is an mail task test

@End2EndTest @RegressionTest
Scenario: Search stared email
Given This stared mail task test

@SmokeTest
Scenario: Search a docs
Given This is a search docs test

@RegressionTest
Scenario: Search a cloud
Given This is a cloud forms test

@End2EndTest @SmokeTest
Scenario: validate a report
Given This is a report test

@End2EndTest
Scenario: Application Logout
Given This is a logout test

@End2EndTest
Scenario: browser closed
Given This is a close broswer test
