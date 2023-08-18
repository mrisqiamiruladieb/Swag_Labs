Feature: Login

  @LoginTdd
  Scenario Outline: Login
    Given User is on login page
    When User input <username> and <password>
    And User click login button
    Then User get verify login <result>

    Examples:
    |    username   |   password   | result |
    | standard_user | secret_sauce | Passed |
    | standard_user | wrongpass123 | Failed |
    | wronguser1234 | secret_sauce | Failed |