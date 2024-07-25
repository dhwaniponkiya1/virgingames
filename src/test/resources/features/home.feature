Feature: Log in page feature

  Scenario: Verify that user should navigate to register page
    Given I am on home page
    When  I select necessary cookies only option
    And  I Click On 'Online Slots' Tab
    Then I Verify Text 'Play Online Slots at Virgin Games'

