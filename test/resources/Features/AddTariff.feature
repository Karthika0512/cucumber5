Feature: Add customer flow

  Scenario Outline: Validate reg page
    Given user launch the browser
    When user enter "<mrental>","<lmin>","<Imin>","<spack>","<lpermin>","<Ipermincharge>","<smscharge>" fields
    Then verify id is displayed or not

    Examples: 
      | mrental | lmin | Imin | spack | lpermin | Ipermincharge | smscharge |
      |    4500 |   20 |   10 |    20 |      15 |            40 |        15 |
