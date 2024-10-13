Feature: login functionality of sales force

  @sc01 @smoketest
  Scenario Outline: login validation with valid credi
    When user enter username "<UserName>" and password "<Password>"
    And user clicks the login button
    Then verify whether the user navigates to the homepage
    Examples:
      | UserName | Password |  |
      | lmti     | abc      |  |
      | hello    | xyz      |  |

    @sco2 @smoketest
  Scenario: login validation with invalid credi
    When user enter username "learnmore" and password "123"
    And user clicks the login button
    Then user verify the error message

