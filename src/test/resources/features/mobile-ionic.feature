@mobile-regression @mobile-search
Feature: Mobile Search Feature

  Background:

  @mobile-search-1
  Scenario: Verify user should be able to slide right on tutorial pages
    Given I am on Splash screen of the ionic conference app
    When I swipe right 3 times on tutorials slides
    Then I verify Continue button is displayed


  @mobile-search-2
  Scenario: Verify total posts displayed
    Given I am on a home page of the app
    When I click on filter button
    And I disable Angular option
    And I click on All Reset Filer button
    Then I verify all options are enabled





