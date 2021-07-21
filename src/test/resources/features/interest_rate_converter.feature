Feature:
  As a user to the Bancolombia group
  I want to access the interest rate convert
  To verify the result of the rate

  @Scenario1
  Scenario: Convert from nominal to effective rate - Successfull
    Given that the user uses the interest rate convert page
    When He wants to convert from nominal to effective rate
    | rate_interest | periodicity | capitalization |
    |         5     | Mensual     |  Mensual       |
    Then He should see the result of conversion from rate nominal to effective rate
    | effective_rate |
    |  0.42 %        |