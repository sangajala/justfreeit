Feature: checking that the homepage have all expected features

  Scenario:  verifying Home link is in home page
    Given user is in homepage
    When  user looks for Home link
    Then user should view a Home link

  Scenario:  verifying CATEGORIES link is in home page
    Given user is in homepage
    When  user looks for CATEGORIES
    Then user should view a CATEGORIES link

  Scenario: verifying the functionality of categories link
    Given  user in in homepage
    When  user clicks on categories link
    Then  user should view all the related items in categories

  Scenario:  verifying ABOUT US link is in home page
    Given user is in homepage
    When  user looks for About Us link
    Then user should view a ABOUT US link


  Scenario:  verifying the functionality of About Us link
    Given user is in homepage
    When  user clicks on ABOUT US link
    Then user should view a About Us page

  Scenario:  verifying CONTACT US link is in home page
    Given user is in homepage
    When  user looks for CONTACT US link
    Then user should view a CONTACT US page

  Scenario:  verifying the functionality of the contact us link
    Given user is in homepage
    When  user clicks on Contact us link
    Then user should view Contact Us page


  Scenario: Home should have option like google to search Item
    Given user is on the homepage
    When  user lookes for search option
    Then user should view a search text box

  Scenario: Checking the search text box with valid data
    Given user is on the homepage
    When user types valid data in the search text box
    And clicks on the search button
    Then user should view the particular valid Item

  Scenario: Checking the search text box with Invalid data
    Given user is on the homepage
    When user types Invalid data in the search text box
    And clicks on the search button
    Then user shouldn't view the particular valid Item
    And  a message "No Item Found" should be display

  Scenario:  verifying Login link is in home page
    Given user is in homepage
    When  user looks for LogIn link
    Then user should view a LogIn page


  Scenario: Verify the login functionality
    Given user is on the homepage
    When user clicks on Log In link
    Then user should view a  LOGIN page


  Scenario:  verifying Register link is in home page
    Given user is in homepage
    When  user looks for Register link
    Then user should view a Register page


  Scenario: Verify the Register functionality
    Given  user is on the homepage
    When user clicks on Register link
    Then user should view the REGISTER page

  Scenario:  verifying Post/Request option  is in home page
    Given user is in homepage
    When  user looks for Post/Request link
    Then user should view a Post/Request page


  Scenario: Verify Post/Request Item link
    Given user is in homepage
    When user clicks Post/Request link
    Then user should view  a message " Please login to post/request items" in a new window page

  Scenario: verify Quick Links label is present in home page
    Given user is in home page
    When user scroll down
    Then user should view Quick Links above the status bar at the end of the web page

