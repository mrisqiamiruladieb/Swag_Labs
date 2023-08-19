@All
Feature: Footer Links

  @TwitterFooterLinksBdd @FooterLinksBdd
  Scenario: Twitter Footer Links
    Given User have login
    When User verify twitter link button
    And User click twitter link button
    Then User verify twitter link result

  @FacebookFooterLinksBdd @FooterLinksBdd
  Scenario: Facebook Footer Links
    Given User have login
    When User verify facebook link button
    And User click facebook link button
    Then User verify facebook link result

  @LinkedInFooterLinksBdd @FooterLinksBdd
  Scenario: LinkedIn Footer Links
    Given User have login
    When User verify linkedin link button
    And User click linkedin link button
    Then User verify linkedin link result