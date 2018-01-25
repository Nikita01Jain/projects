Feature: Menu categories
Scenario: To verify Women's tab
Given I am on homepage
When I hover over the element "//a[@title = 'Women']"
And I click on the "T-shirts" link
Then I should see "T-shirts - My Store"
When I hover over the element "//a[@title = 'Women']"
And I click on the "Blouses" link
Then I should see "Blouses - My Store"

Scenario: To verify Dresses's tab
Given I am on homepage
When I hover over the element "(//a[@title = 'Dresses'])[2]"
And I click on the "CASUAL DRESSES" link
Then I should see "CASUAL DRESSES"

#Evening Dresses
Given I am on homepage
When I hover over the element "(//a[@title = 'Dresses'])[2]"
And I click on the "EVENING DRESSES" link
Then I should see "EVENING DRESSES"

#Summer Dresses
Given I am on homepage
When I hover over the element "(//a[@title = 'Dresses'])[2]"
And I click on the "SUMMER DRESSES" link
Then I should see "SUMMER DRESSES"

