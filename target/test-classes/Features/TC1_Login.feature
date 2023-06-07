@Login
Feature: Verifying OMR Branch Login Details

  Scenario Outline: Verifying  login with valid data
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"

    Examples: 
      | UserName               | Password      |
      | bharathiec04@gmail.com | 9500777950Vb$ |

@Login1

  Scenario Outline: Verifying  login with valid data using enter key
    Given User is on the omrbranch hotel page
    When User login with EnterKey "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"

    Examples: 
      | UserName               | Password      |
      | bharathiec04@gmail.com | 9500777950Vb$ |
@Login2

  Scenario Outline: Verifying  login with invalid data
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login error message "Invalid Login details or Your Password might have expired"

    Examples: 
      | UserName               | Password      |
      | bharathiec04@gmail.com | 950077795Vb$ |
