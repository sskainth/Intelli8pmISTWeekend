@flipcart
Feature: Flipcart Home Page validation


  Scenario:Open the Flipkart homepage to validate credential
    When enter a valid username/email/phone number in the username <username> and <password> in password fields.
    And click Login** button/icon on the top-right corner of the homepage
    Then user is successfully logged in and redirected to the homepage or their account dashboard.
    And user’s name or profile icon should be displayed on the top-right corner of the page, confirming successful login.
    And There s hould be no error messages (e.g., "Invalid username or password").
    And User should have access to account-specific functionalities (e.g., view orders, add items to the cart).
