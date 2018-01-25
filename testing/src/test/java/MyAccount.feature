Feature: My Account page

  Scenario: Login to the system
    Given I am on homepage
    When I click on the "Sign in" link
    And I enter username and password
    When I click on the button "Sign in"
    Then I should see "My account - My Store"
    When I click on the "ORDER HISTORY AND DETAILS" link
    Then the warning message appears as "You have not placed any orders."
    Then I should see "Order history - My Store"
    And I click on the button "Back to your account"
    And I am on this url "controller=my-account"
    Then I click on the "MY WISHLISTS" link
    When I enter random text "name" with "test"
    And I click on the button "Save"
    And I click on the button "Back to your account"
    Then I click on the "MY CREDIT SLIPS" link
    Then the warning message appears as "You have not received any credit slips."
    And I click on the button "Back to your account"
    Then I click on the "MY ADDRESSES" link
    Then I should see "Addresses - My Store"
    And I click on the button "Add a new address"
    When I fill in "firstname" with "Nikita"
    And I fill in "lastname" with "Jain"
    When I fill in "address1" with "US"
    And I fill in "city" with "Louisville"
    And I select "id_state" with "Kentucky"
    And I fill in "postcode" with "40018"
    And I select "id_country" with "United States"
    And I fill in "phone" with "7889456123456"
    And I fill in "phone_mobile" with "789456123456"
    And I enter random text "alias" with "Address"
    When I click on the button "Save address"
    And I click on the button "Back to your account"
    Then I click on the "MY PERSONAL INFORMATION" link
    Then I should see "Identity - My Store"
    And I click on the button "Back to your account"
