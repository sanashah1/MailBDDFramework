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
Feature: Create new contacts

Scenario Outline: Mail Loginin Test

Given user is at mail page
When title page of login is Free email accounts with mail.com | Log in here or register today
Then user clicks on login button
Then user enters the "<username>" and "<Password>"
Then user enters the log in button
Then user is logged to home page
Then user clicks on contact page
Then user moves on new contact link
Then user enters "<title>" and "<firstname>" and "<lastname>" and "<company>"
Then user hits save button
Then user quit

Examples:
| username | Password | title | firstname | lastname |company |
|sanashaukath@mail.com | Phoebe@2023 | Mr. | Leon | Mcflurry | NTTData |
|sanashaukath@mail.com | Phoebe@2023 | Ms. | Bharati | Singh | NTTData |
