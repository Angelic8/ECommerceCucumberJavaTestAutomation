Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for Login
      | Username | Password      |
      | admin    | adminpassword |
      | admin1   | blossom       |
      | admin2   | bloom         |
    And I click the login button
    Then I should see the userform page
      | Name   | Email |
      | Sam    | Smith |
      | Nicole | Son   |