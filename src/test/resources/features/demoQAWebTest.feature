Feature: DemoQA Web Testing

  @Test1
  Scenario: Validate Text Box
    Given I open the DemoQA website
    When I select Text Box from Elements
    When I enter a valid name in the Full Name Text Box
    And I enter a valid email address in the Email Text Box
    And I enter the address line 1 and press enter in the Current Address Text Box
    And I enter address line 2 in the Current Address Text Box
    Then The text boxes should be populated with the correct values