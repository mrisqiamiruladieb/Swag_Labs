@All
Feature: Action Cart

  @AddRemProActCartBdd @ActCartBdd
  Scenario: Add Remove Products
    Given User successfully logged in
    When User verify products to add to cart
    And User click add products to cart
    Then User verifies the number of products added
    When User click the cart button
    And User verify products to remove from cart
    And User click remove products from cart
    And User verifies the number of products removed
    And User click continue shopping button
    Then User verify remove products result

  @CheckoutActCartBdd @ActCartBdd
  Scenario: Checkout
    Given User successfully logged in
    When User verify products to add to cart
    And User click add products to cart
    Then User verifies the number of products added
    When User click the cart button
    And User verify checkout button
    And User click checkout button
    Then User verify personal data checkout page
    When User fill data on personal data checkout page
    And User click continue button
    Then User verify checkout overview page
    When User click finish button
    Then User verify checkout result
    When User click back to products button
    Then User verify products page

  @CancelCheckoutActCartBdd @ActCartBdd
  Scenario: Cancel Checkout
    Given User successfully logged in
    When User verify products to add to cart
    And User click add products to cart
    Then User verifies the number of products added
    When User click the cart button
    And User verify checkout button
    And User click checkout button
    Then User verify personal data checkout page
    When User fill data on personal data checkout page
    And User click continue button
    Then User verify checkout overview page
    When User click cancel button
    Then User verify products page

  @DataErrorCheckoutActCartBdd @ActCartBdd
  Scenario: Data Error Checkout
    Given User successfully logged in
    When User verify products to add to cart
    And User click add products to cart
    Then User verifies the number of products added
    When User click the cart button
    And User verify checkout button
    And User click checkout button
    Then User verify personal data checkout page
    When User click continue button
    Then User get data error message

  @DetailProductActCartBdd @ActCartBdd
  Scenario: Detail Product
    Given User successfully logged in
    When User verify products to add to cart
    And User click add products to cart
    Then User verifies the number of products added
    When User click the cart button
    And User verify detail product link
    And User click detail product link
    Then User verify back to products button
    When User click back to products button
    Then User verify products page

