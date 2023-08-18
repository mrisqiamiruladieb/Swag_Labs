@All
Feature: Login

  @PositiveLoginBdd @LoginBdd
  Scenario: Login
    Given User is on login page
    When User fill username and password
    And User click login button
    Then User verify login result

  @NegativeLoginBdd @LoginBdd
  Scenario: Login Invalid Account
    Given User is on login page
    When User fill invalid username and password
    And User click login button
    Then User get error message