Feature: Checkout

  @ActCartTdd
  Scenario Outline: Data Input on Checkout pages
    Given User successfully logged in
    When User verify products to add to cart
    And User click add products to cart
    Then User verifies the number of products added
    When User click the cart button
    And User verify checkout button
    And User click checkout button
    Then User verify personal data checkout page
    When User input <firstname>, <lastname>, <zip> on personal data checkout page
    And User click continue button
    Then User get verify checkout overview page <result>

    Examples:
    | firstname | lastname |  zip  | result |
    |    Ming   | Gallardo | 56789 | Passed |
    |           |          |       | Failed |
    |    Ming   |          | 56789 | Failed |
    |           | Gallardo |       | Failed |