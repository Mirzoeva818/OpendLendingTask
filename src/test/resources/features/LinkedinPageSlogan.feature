Feature: Slogan on Linkedin company Page
  User Story:
  As user, I should be able to search for Open lending page on google
  and verify if slogan is matching expected message


  Scenario: Search in google for Open Lending's linkedin page and verify
  slogan message under the logo
    Given  user is on google page
    When user searches for Open Lending linkedin account on google
    And user clicks on Company linkedin page
    Then user should verify the slogan