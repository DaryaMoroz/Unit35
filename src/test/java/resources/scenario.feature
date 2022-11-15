Feature: if this lesson clear
  Scenario: This lesson is not clear
    Given we have an opinion about lesson that it 'does not clear'
    When I have asked if this lesson is clear?
    Then I have got an answer 'Nope'
