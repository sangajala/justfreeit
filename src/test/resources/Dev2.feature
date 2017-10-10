Feature: Check that Account page has the expected features

  Scenario: User is able to navigate to Register page
    Given The user is on the home page
    When the user clicks on the Register button
    Then the user is able to navigate to Register page and views the message "Welcome to Just Free It"

  Scenario: User is able to register their details successfully
    Given The user in on the Register page
    When The user enters all the required details in all the fields and clicks on the register button
    Then The user is able to register their details and views the message "Hello"

  Scenario: User is unable to register their details
    Given The user is on the register page
    When The user enters invalid details and clicks on the register button
    Then The user is unable to register their details and an error message appears

  Scenario: User is unable to register their details
    Given The user is on the register page
    When The user does not enter valid valid details in all the fields and clicks on the register button
    Then The user is unable to register their details and an error message appears

  Scenario: User is able to navigate to login page
    Given The user is on the home page
    When the user clicks on the login button
    Then the user is able to navigate to Login page and views the message " Welcome to Just Free It"

  Scenario: User is able to login successfully and User Profile is visible
    Given The user is on the login page
    When the user enters valid email and password details and clicks on the login button
    Then the user is able to login successfully and User Profile is visible

  Scenario: User is able to login successfully and Save sign-in info is visible
    Given The user is on the login page
    When the user enters valid email and password details and clicks on the login button
    Then the user is able to login successfully and Save sign-in info is visible

  Scenario: User is able to login successfully and edit their username
    Given The user is on the login page and has successfully logged in
    When the user clicks on the Edit Profile link
    Then the user is able to edit their username on the Edit Profile link

  Scenario: User is able to login successfully and edit their Mobile number
    Given The user is on the login page and has successfully logged in
    When the user clicks on the Edit Profile link
    Then the user is able to  edit their Mobile Number on the Edit Profile link

  Scenario: User is able to login successfully and edit their Address
    Given The user is on the login page and has successfully logged in
    When the user clicks on the Edit Profile link
    Then the user is able to  edit their Address on the Edit Profile link


  Scenario: User is able to login successfully and edit their  Postal Address
    Given The user is on the login page and has successfully logged in
    When the user clicks on the Edit Profile link
    Then the user is able to  edit their  Postal Address on the Edit Profile link


  Scenario: User is able to login successfully and edit their profile and update the changes
    Given The user is on the login page and has successfully logged in
    When the user edits their profile and clicks on the update button
    Then the user is able to update the changes and is able to view the popup message "Updated successfully"

  Scenario: user is able to change password successfully and update the changes
    Given the user has successfully logged into their account
    When the user clicks on the change password link and enters the relevant details
    Then the user is able to change password and update the changes

  Scenario: User is able to login successfully and view Items Donated
    Given The user is on the login page and has successfully logged in
    When the user clicks on the Items Donated link
    Then the user is able to  view Items Donated


  Scenario: User is able to login successfully and view Items Requested
    Given The user is on the login page and has successfully logged in
    When the user clicks on the Items Donated link
    Then the user is able to  view Items Requested

  Scenario: user is able to logoff successfully and return to home page
    Given the user has logged in successfully
    When the user clicks on the log off button
    Then the user is able to logoff and return to home page

  Scenario:User is unable to login with invalid details
    Given the user is on login page
    When the user enters invalid details and clicks on the login button
    Then the user is unable to login and an error message  appears