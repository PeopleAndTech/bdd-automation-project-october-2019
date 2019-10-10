Feature: Login Page field validation

  Scenario: UI validation for login
    Given I open the browser and navigate to facebook login page
    When I land on facebook homepage i validate login page is displayed
    Then I validate email or phone field is displayed
    Then I validate password field is displayed
    Then I validate Login button is displayed


