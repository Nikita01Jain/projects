Feature: Search on the web-site
Scenario: Search
Given I am on homepage
And I wait for "5000" milliseconds
When I fill in "search_query" with "Summer dresses"
And I press "submit_search"
Then I hover over the element "(//div[@class='product-container'])[1]"
When I follow "Add to cart"
And I wait for Ajax to load
And I press "//span[@class='cross']"
Then I hover over the element "//a[@title='View my shopping cart']"
And I press "//span[@class='remove_link']"
And I wait for "5000" milliseconds



