@All
Feature: Logout

  @LogoutBdd
  Scenario: Logout
    Given User is already logged in
    When User verify open menu button
    Then User click open menu button
    When User verify logout button
    And User click logout button
    Then User verify logout result
