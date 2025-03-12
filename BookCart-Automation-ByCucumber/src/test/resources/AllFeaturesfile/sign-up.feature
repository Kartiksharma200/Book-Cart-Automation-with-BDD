Feature: User Sign Up

  Scenario: Successful Sign Up with Valid Details
    Given the user is on the sign-up page
    When the user enters valid details
      | Field           | Value                  |
      | First Name      | Kartik                 |
      | Last Name       | Sharma                 |
      | Email           | Kartiksharma@gmail.com |
      | Password        | Password@123           |
      | Verify Password | Password@123           |
      
    And clicks the sign-up button
    Then the user should be redirected to the Sign In page
    And see a confirmation message "Sign-up successful!"

  Scenario: Sign Up with Invalid Name
    Given the user is on the sign-up page
    When the user enter name "1234"
    And click the sign-up button
    Then the user should see an error message "Invalid Name"

  Scenario: Sign Up with Existing Email
    Given the user is on the sign-up page
    When the user enters an already registered email "Kartiksharma@gmail.com"
    And clicks the sign-up button
    Then the user should see an error message "Email already exists."

  Scenario: Sign Up with Weak Password
    Given the user is on the sign-up page
    When the user enters a weak password "12345"
    And clicks the sign-up button
    Then the user should see an error message "Password is too weak."

  Scenario: Sign Up with mis Match Password
    Given the user is on the sign-up page
    When the user enters a password "12345"
    And the user enter a diffrent password "12345667"
    And clicks the sign-up button
    Then the user should see an error message "Password Not Match."

  Scenario: Sign Up with Missing Required Fields
    Given the user is on the sign-up page
    When the user leaves the required fields empty
    And clicks the sign-up button
    Then the user should see an error message "All fields are required."

  Scenario: Sign Up with Invalid Email Format
    Given the user is on the sign-up page
    When the user enters an invalid email format "invalid-email"
    And clicks the sign-up button
    Then the user should see an error message "Please enter a valid email address."
