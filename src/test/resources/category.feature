Feature: user can view the items through categories


  Scenario:user can browse the job in sub categories
    Given user is on home page
    When user clicks categories
    And when user clicks job
    And user clicks services
    And user checks the contact number
    Then the contact number  should be displayed for the selected item

  Scenario: user can browse the books in sub categories
    Given user is on home page
    When user clicks categories
    And user clicks books and magazines
    And user clicks books
    Then selected book should be displayed


  Scenario: user can browse the magazines in sub categories
    Given user is on home page
    When user clicks categories
    And user clicks books and magazines
    And user clicks on magazines
    Then magazines should be displayed

  Scenario: user can browse the miscellaneous in sub categories
    Given user is on home page
    When user clicks categories
    And user clicks miscellaneous
    Then miscellaneous item should be displayed




