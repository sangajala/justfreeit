Feature: Checking the login functionality

  Background: user should be in homepage

  Scenario: Login with valid credentials
    When user types valid email from database
    And  user clicks on Login link
    Then  user should login successfully

  Scenario: Login with Invalid email and valid password
    When  user types  in the email "abc@yahoo.com" and password "abcdef"
    And  user clicks on login link
    Then user should view a message "Sorry Invalid Credientials"

  Scenario: Login with valid email and Invalid password
    When  user types  in the email "abcde@yahoo.com" and password "abcde"
    And  user clicks on login link
    Then user should view a message "Sorry Invalid Credientials"


  Scenario: Login with unregistered user
    When user types in the email "sandy123@yahoo.com" and password "sandy12345"
    And  user clicks on login link
    Then user should not login
    And  user should view a message "Sorry Invalid Credientials"

  Scenario: Login with valid email and empty password
    When  user types  in the email "abcde@yahoo.com" and password ""
    And  user clicks on login link
    Then user should view a message "Password Required"

  Scenario: Login with empty email and valid password
    When  user types  in the email "" and password "abcdef"
    And  user clicks on login link
    Then user should view a message "Sorry Invalid Credientials"

  Scenario: Login with empty email and empty password
    When  user types  in the email "" and password ""
    And  user clicks on login link
    Then user should view a message "User Name Required"