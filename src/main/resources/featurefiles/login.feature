Feature: Login
  Scenario: Successful login with valid credentials
    Given User launches the application
    And User Enters "Login name" and "Password"
    Then User click on login button
    Then Page title should be "Orange HRM"

