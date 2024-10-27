@amazon
Feature: Amazon Home Page validation

  #before
  @amazon01
  Scenario: Search functionality
    #beforestep
    When user enter the product name "iphone"
    #afterstep
    #beforestep
    And user clicks the search icon
    #afterstep
    #beforestep
    Then user validate the title of the page
    #beforestep
    And user validate the search results
    #after

    #before
  @amazon02 @regression
  Scenario: baby wishlist page navigation
   # Given user navigate to Amazon HomePage
    When user click baby wish list option from Account menu
    Then validate the navigation

    @amazon03 @smoke
    Scenario Outline: Search functionality with multiple test data
    #  Given user navigate to Amazon HomePage
      When user enter the product name "<ProductName>"
      And user clicks the search icon
      Then user validate the title of the page
      And user validate the search results
      Examples:
        | ProductName |
        | iphone      |
        | mouse       |
       # | laptop      |

   @Amazon04
    Scenario: Handling of static dropdown
     # Given user navigate to Amazon HomePage
      When user select the dropdown value from category dropdown
      And user extracts the dropdown values
      Then validate the dropdown values





