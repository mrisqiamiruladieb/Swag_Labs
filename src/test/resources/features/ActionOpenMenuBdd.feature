@All
Feature: Action Open Menu

  @AllItemsActOpMenBdd @ActOpMenBdd
  Scenario: All Items Action Open Menu
    Given User has logged in
    When User verify product to add to cart
    Then User click add product to cart button
    When User verify cart contents
    Then User click cart button
    When User verify open menu link button
    Then User click open menu link button
    When User verify all items button
    And User click all items button
    Then User verify all items button result

  @AboutActOpMenBdd @ActOpMenBdd
  Scenario: About Action Open Menu
    Given User has logged in
    When User verify open menu link button
    Then User click open menu link button
    When User verify about button
    And User click about button
    Then User verify about button result

  @ResetAppStateActOpMenBdd @ActOpMenBdd
  Scenario: Reset App State Action Open Menu
    Given User has logged in
    When User verify product to add to cart
    Then User click add product to cart button
    When User verify cart contents
    Then User click open menu link button
    When User verify reset app state button
    And User click reset app state button
    Then User verify reset app state result
