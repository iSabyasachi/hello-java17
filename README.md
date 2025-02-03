# hello-java17

/*
Problem Statements: For each statement period data, find the period range for Trailing Three Months,
Trailing Sixth Months, Trailing Twelve Months & Fiscal Year To Date.
Example:
  T3M: Trailing Three Months
  T6M: Trailing Sixth Months
  T12M: Trailing Twelve Months
  YTD: Fiscal Year To Date
        *
  Find Date range for each statement period for T3M, T6M, T12M & YTD

  Result:
  Map.of(
  T3M, [
    {LocalDate.of(2024, 1, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 1, 31)},
    {LocalDate.of(2024, 2, 29), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 2, 29)},
    {LocalDate.of(2024, 3, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 3, 31)},
    {LocalDate.of(2024, 4, 30), LocalDate.of(2024, 4, 30), LocalDate.of(2024, 4, 30)},
    {LocalDate.of(2024, 5, 31), LocalDate.of(2024, 4, 30), LocalDate.of(2024, 5, 31)},
    {LocalDate.of(2024, 6, 30), LocalDate.of(2024, 4, 30), LocalDate.of(2024, 6, 30)},
    {LocalDate.of(2024, 7, 31), LocalDate.of(2024, 7, 31), LocalDate.of(2024, 7, 31)},
    {LocalDate.of(2024, 8, 31), LocalDate.of(2024, 7, 31), LocalDate.of(2024, 8, 31)},
    {LocalDate.of(2024, 9, 30), LocalDate.of(2024, 7, 31), LocalDate.of(2024, 9, 30)},
    {LocalDate.of(2024, 10, 31), LocalDate.of(2024, 10, 31), LocalDate.of(2024, 10, 31)},
    {LocalDate.of(2024, 11, 30), LocalDate.of(2024, 10, 31), LocalDate.of(2024, 11, 30)},
    {LocalDate.of(2024, 12, 31), LocalDate.of(2024, 10, 31), LocalDate.of(2024, 12, 31)},
  ])
        *
  T6M, [
    {LocalDate.of(2024, 1, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 1, 31)},
    {LocalDate.of(2024, 2, 29), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 2, 29)},
    {LocalDate.of(2024, 3, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 3, 31)},
    {LocalDate.of(2024, 4, 30), LocalDate.of(2024, 1, 30), LocalDate.of(2024, 4, 30)},
    {LocalDate.of(2024, 5, 31), LocalDate.of(2024, 1, 30), LocalDate.of(2024, 5, 31)},
    {LocalDate.of(2024, 6, 30), LocalDate.of(2024, 1, 30), LocalDate.of(2024, 6, 30)},
    {LocalDate.of(2024, 7, 31), LocalDate.of(2024, 7, 31), LocalDate.of(2024, 7, 31)},
    {LocalDate.of(2024, 8, 31), LocalDate.of(2024, 7, 31), LocalDate.of(2024, 8, 31)},
    {LocalDate.of(2024, 9, 30), LocalDate.of(2024, 7, 31), LocalDate.of(2024, 9, 30)},
    {LocalDate.of(2024, 10, 31), LocalDate.of(2024, 7, 31), LocalDate.of(2024, 10, 31)},
    {LocalDate.of(2024, 11, 30), LocalDate.of(2024, 7, 31), LocalDate.of(2024, 11, 30)},
    {LocalDate.of(2024, 12, 31), LocalDate.of(2024, 7, 31), LocalDate.of(2024, 12, 31)},
  ])
        *
  T12M, [
    {LocalDate.of(2024, 1, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 1, 31)},
    {LocalDate.of(2024, 2, 29), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 2, 29)},
    {LocalDate.of(2024, 3, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 3, 31)},
    {LocalDate.of(2024, 4, 30), LocalDate.of(2024, 1, 30), LocalDate.of(2024, 4, 30)},
    {LocalDate.of(2024, 5, 31), LocalDate.of(2024, 1, 30), LocalDate.of(2024, 5, 31)},
    {LocalDate.of(2024, 6, 30), LocalDate.of(2024, 1, 30), LocalDate.of(2024, 6, 30)},
    {LocalDate.of(2024, 7, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 7, 31)},
    {LocalDate.of(2024, 8, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 8, 31)},
    {LocalDate.of(2024, 9, 30), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 9, 30)},
    {LocalDate.of(2024, 10, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 10, 31)},
    {LocalDate.of(2024, 11, 30), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 11, 30)},
    {LocalDate.of(2024, 12, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 12, 31)},
  ])
        *
  YTD, [
    {LocalDate.of(2024, 1, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 1, 31)},
    {LocalDate.of(2024, 2, 29), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 2, 29)},
    {LocalDate.of(2024, 3, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 3, 31)},
    {LocalDate.of(2024, 4, 30), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 4, 30)},
    {LocalDate.of(2024, 5, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 5, 31)},
    {LocalDate.of(2024, 6, 30), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 6, 30)},
    {LocalDate.of(2024, 7, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 7, 31)},
    {LocalDate.of(2024, 8, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 8, 31)},
    {LocalDate.of(2024, 9, 30), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 9, 30)},
    {LocalDate.of(2024, 10, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 10, 31)},
    {LocalDate.of(2024, 11, 30), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 11, 30)},
    {LocalDate.of(2024, 12, 31), LocalDate.of(2024, 1, 31), LocalDate.of(2024, 12, 31)},
  ]
  *
  */
