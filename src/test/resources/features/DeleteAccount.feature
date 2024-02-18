Feature: Guru99 Testing - Delete Account No Module

  @deleteaccountmodule
  Scenario Outline: Validation of AccountNo field and valid errors
    Given user is navigated to login page with url "http://demo.guru99.com/V1/"
    And user is logged into guru portal with userName and password
    When user enters Invalid AccountNo as "<value>" and tab off
    Then error message should be displayed and it should be "<error_message>"
    Examples:
      | value    | error_message                      |
      |          | Account Number must not be blank   |
      | xyz      | Characters are not allowed         |
      | #!$abc12 | Special characters are not allowed |
      | 1234pqr  | Characters are not allowed         |


#  Scenario: Submit with Invalid Invalid CustomerId
#    Given user is navigated to login page with url "http://demo.guru99.com/V1/"
#    And user is logged into guru portal with userName and password
#    When user enters customerId as "123" and tab off
#    And user click on submit button
#    Then user is successfully navigated to redirect page without any errors