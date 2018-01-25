@smokeTest
Feature: To test my cucumber test is running
I want to run a sample feature file.

Scenario: cucumber setup

Given I am on homepage
When I click on the Signin link
And I enter username and password
And click on submit button
Then print a succssful message