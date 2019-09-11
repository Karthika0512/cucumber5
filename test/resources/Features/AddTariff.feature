Feature: Add customer flow

  Scenario: Validate reg page
    Given user launch the browser
    When user enter all fields
      | mrental | lmin | Imin | spack | lpermin | Ipermincharge | smscharge |
      |      45 |   10 |   10 |    30 |      20 |            10 |        20 |
      
    Then verify id is displayed or not
