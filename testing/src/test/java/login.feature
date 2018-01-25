Feature: Login/Sign-in scenarios

Scenario: Register new account
Given I am on homepage
When I click on the "Sign in" link
When I enter email-address in "email_create"
And I click on the button "Create an account"
Then I should see "Login - My Store" page
And I wait for "5000" milliseconds
When I create an account with email address "niki01jain@gmail.com" and password "nikita@123"
And I click on the button "Register"


Scenario: Login to the system with valid email-id and password
Given I am on homepage
When I click on the "Sign in" link
And I enter username and password
When I click on the button "Sign in"
Then I should see "My account - My Store" page






   



							