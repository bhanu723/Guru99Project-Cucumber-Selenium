Feature: Guru99 Login
  @guru99login
  Scenario: Login Functionality of Guru99
    Given user is navigated to login page with url "http://demo.guru99.com/V1/"
    When user is logged into guru portal with userName and password
    Then user should be logged in successfully without any errors