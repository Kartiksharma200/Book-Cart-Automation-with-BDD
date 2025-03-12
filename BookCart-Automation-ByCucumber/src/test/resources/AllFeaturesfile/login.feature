Feature: Verify login

  Scenario: Verify login with valid Details
    Given User on Login Page
    When enter an valid username and password details
    And click on login button
    Then user redirect to home page

  #Scenario Outline: Verify login with invalid Details
    #Given User on Login Page
    #When enter an invalid <username> and <password> details
    #And click on login button
    #Then user get an error
    #Examples:
    #
      #| username | password |
      #| sher     |     1234 |
      #| sherrr   | sherrr   |
      #| Sher123  | Sher@123 |
#
  #Scenario: Verify login with Empty Details
    #Given User on Login Page
    #When user left blank both username and password
    #And click on login button
    #Then user getting error message
