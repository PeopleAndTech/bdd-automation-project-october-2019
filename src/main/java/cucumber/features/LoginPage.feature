Feature: Login Page field validation

  Scenario Outline: User being able to login to facebook
    Given I open the browser and navigate to facebook login page
    When I land on facebook homepage i validate login page is displayed
    Then I write <username> and <password>
    And I click on login button
    And I validate user logged in
    And I quit the browser

    Examples:
      | username | password |
      | user001  | pass001  |
      | user002  | pass002  |

  Scenario: UI validation for login
    Given I open the browser and navigate to facebook login page
    When I land on facebook homepage i validate login page is displayed
    Then I validate email or phone field is displayed
    And I validate password field is displayed
    And I validate Login button is displayed
    And I quit the browser

  Scenario: UI validation for login
    Given User opens the browser and navigate to facebook login page
    When User lands on facebook homepage validates login page is displayed
    Then User validates email or phone field is displayed
    And User validates password field is displayed
    And User validates Login button is displayed
    And User quits the browser