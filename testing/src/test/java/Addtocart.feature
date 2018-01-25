Feature: Add to cart
Scenario: Add to cart the products
Given I am on homepage
And I wait for "5000" milliseconds
When I fill in "search_query" with "Summer dresses"
And I press "submit_search"
Then I hover over the element "(//div[@class='product-container'])[1]"
When I follow "Add to cart"
And I wait for Ajax to load
When I click on the button "Continue shopping"
Then I hover over the element "(//a[@title = 'Faded Short Sleeve T-shirts'])[1]"
When I follow "Add to cart"
And I wait for Ajax to load
And I click on the button "Proceed to checkout"
Then I should see the tab "//li[@class = 'step_current  first']"
