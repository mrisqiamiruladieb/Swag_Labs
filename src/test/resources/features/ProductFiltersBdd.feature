@All
Feature: Product Filters

  @AscNameProductFiltersBdd @ProductFiltersBdd
  Scenario: Ascending Name Product Filters
    Given User is on products page
    When User click product sort button
    Then User verify ascending name product sort option
    When User click ascending name product sort option
    Then User verify ascending name product sort result

  @DescNameProductFiltersBdd @ProductFiltersBdd
  Scenario: Descending Name Product Filters
    Given User is on products page
    When User click product sort button
    Then User verify descending name product sort option
    When User click descending name product sort option
    Then User verify descending name product sort result

  @AscPriceProductFiltersBdd @ProductFiltersBdd
  Scenario: Ascending Price Product Filters
    Given User is on products page
    When User click product sort button
    Then User verify ascending price product sort option
    When User click ascending price product sort option
    Then User verify ascending price product sort result

  @DescPriceProductFiltersBdd @ProductFiltersBdd
  Scenario: Descending Price Product Filters
    Given User is on products page
    When User click product sort button
    Then User verify descending price product sort option
    When User click descending price product sort option
    Then User verify descending price product sort result