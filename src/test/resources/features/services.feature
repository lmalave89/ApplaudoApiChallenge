Feature: Automation services Applaudo  challenge

  Scenario: Get Walter White information
    When use get petition to get information of Walter White
    Then print in console the birthday information

  Scenario: Get all characters information
    When use get petition to get information of all characters
    Then print in console the their information