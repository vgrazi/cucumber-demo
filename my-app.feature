Feature: Belly
  Optional description of the feature

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hours
    Then my belly should not growl

  Scenario: a few cukes short time
    Given I have 42 cukes in my belly
    When I wait 2 hours
    Then my belly should growl

  Scenario: low cukes short time
    Given I have 5 cukes in my belly
    When I wait 2 hours
    Then my belly should not growl

  Scenario Outline: try examples
    Given I have <count> cukes in my belly
    When I wait <time> hours
    Then I should expect answer <answer>

    Examples:
      | count | time | answer |
      |42 | 1 |false |
      |42 | 2 |true |
      |5  | 2 |false |