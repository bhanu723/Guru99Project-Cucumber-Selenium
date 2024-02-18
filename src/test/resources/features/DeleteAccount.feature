Feature: Guru99 Testing - Delete Account No Module

  Background: User logs into Guru Login Page
    Given user is navigated to login page with url "http://demo.guru99.com/V3/"
    And user is logged into guru portal with userName and password

  @deleteaccountmodule @smoketest
  Scenario Outline: Validation of AccountNo field and valid errors "<scenario>"
    Given user is already logged In and is on Home page
    When user enters Invalid AccountNo as "<value>" and tab off
    Then error message should be displayed and it should be "<error_message>"
    Examples:
      | scenario                   | value    | error_message                      |
      | When AccNo is Blank        |          | Account Number must not be blank   |
      | When AccNo is Characters   | xyz      | Characters are not allowed         |
      | When AccNo as SpecialChar  | #!$abc12 | Special characters are not allowed |
      | When AccNo is ALPHANUMERIC | 1234pqr  | Characters are not allowed         |

  @deleteaccountmodule @regressiontest
  Scenario: Submit with Invalid CustomerId
    Given user is already logged In and is on Home page
    When user enters Invalid AccountNo as "1234" and tab off
    And user click on submit button
    Then error pop up should be displayed

