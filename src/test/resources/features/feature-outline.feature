#@Ignored
Feature: Cucumber Binge
  This is a sample application, to
  demo the use of Gherkin and Cucumber

  Background:
    Given I created a belly object
    And I set the cukes to 0

  Scenario: low cukes short time
    This is a test scenario
    Given I have 5 cukes in my belly
    When I wait 2 hours
    Then my belly should not growl

#  @ignored
  Scenario: low cukes with comment
    Given I add comment # 5
      """
      this is a
      very long comment
      """
    When I wait 2 hours
    Then my belly should not growl

#  @ignored
  Scenario Outline: try examples
    Given I have <count> cukes in my belly
    When I wait <time> hours
    Then I should expect answer <answer>

    Examples:
      | count | time | answer |
      | 42    | 1    | false  |
      | 42    | 2    | true   |
      | 5     | 2    | false  |

  Scenario: try datatable
    Given the following users exist:
      | name   | email              | twitter         |
      | Aslak  | aslak@cucumber.io  | @aslak_hellesoy |
      | Julien | julien@cucumber.io | @jbpros         |
      | Matt   | matt@cucumber.io   | @mattwynne      |
    When I wait 2 hours
    Then I should expect answer false
