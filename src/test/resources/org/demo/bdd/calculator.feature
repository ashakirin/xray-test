Feature: Simple Calculator
  Scenario Outline: Adding two numbers
    Given I have a calculator
    When I add <num1> and <num2>
    Then I should get <total>
    Examples:
      | num1 | num2 | total |
      | -2   | 3    | 1     |
      | 10   | 15   | 25    |
      | 99   | -99  | 0     |
      | -1   | -10  | -11   |