Feature: Bingo page feature

  Scenario: Verify that user navigated to bingo page successfully
    Given I am on home page
    When  I select necessary cookies only option
    And I click on "Online Bingo" from top menu
    Then Verify that I should be navigate to bingo page successfully
