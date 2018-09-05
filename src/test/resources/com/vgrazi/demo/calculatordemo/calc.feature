Feature: calculator spec
  Scenario: zero
    Given A blank calculator
    When parameter is "0"
    Then Result should be "0.0"

  Scenario: Only a number
    Given A blank calculator
    When parameter is "1234"
    Then Result should be "1234.0"

  Scenario: Only times
    Given A blank calculator
    When parameter is "12*34"
    Then Result should be "408.0"

  Scenario: Only divided
    Given A blank calculator
    When parameter is "1/2"
    Then Result should be "0.5"

  Scenario: Several times
    Given A blank calculator
    When parameter is "12*11*15"
    Then Result should be "1980.0"

  Scenario: Several times and div
    Given A blank calculator
    When parameter is "1/2*3/4*5"
    Then Result should be "1.875"

  Scenario: one plus
    Given A blank calculator
    When parameter is "123+45"
    Then Result should be "168.0"

  Scenario Outline: many
    Given A blank calculator
    When parameter is "<param>"
    Then Result should be "<result>"
    Examples:
    |param          |result       |
    |0              |0.0          |
    |12+34          |46.0         |
    |12*13          |156.0        |
    |2*3*4          |24.0         |
    |12*11+101      |233.0        |
    |5*(11+10)      |105.0        |
    |5+6*(11+10)    |131.0        |
    |12*5+6*(11+10) |186.0        |