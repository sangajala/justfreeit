Feature: Check that homepage have all expected feature

#  Background:
#    Given User is on the home page

  @SRIRAM
  Scenario Outline: Major links are visible

    Given User is on the home page
    When he clicks on "<col>" link
    Then he should be landed on page with text "<Text>"
    When user navigates back

    Examples:

      | col        | Text                                                            |
      | About Us   | Lorem ipsum dolor sit amet, consectetur adipisicing elit sed do |
      | Contact Us | Send Us Your Feedback                                           |
      | Categories | Recent Adds                                                     |

  Scenario: User tries contact the company and success

    Given User is on the home page
    When he clicks on "Contact Us" link
    And he enters data in contact us form with name "Sandhya" and email "sandhya@gmail.com" and subject "Mobile app for my business" and message "I got 100000 pounds"
    Then he should be landed on page with text "Your message successfully sent, Thank You"

  Scenario Outline: User tries contact the company failed if data is invalid

    Given User is on the home page
    When he clicks on "Contact Us" link
    And he enters data in contact us form with name "<name>" and email "<email>" and subject "<sub>" and message "<message>"
    Then he should be landed on page with text "<error>"

    Examples:
      | name    | email         | sub                        | message             | error          |
      | Sandhya |               | Mobile app for my business | I got 100000 pounds | EMail Required |
      |         | test@test.com | Mobile app for my business | I got 100000 pounds | Name Required  |


  Scenario Outline: User tries contact the send feedback

    Given User is on the home page
    And he enters data in contact us form with name "<name>" and email "<email>" and subject "<sub>" and message "<message>"
    Then he should be landed on page with text "<error>"

    Examples:
      | name    | email         | sub                        | message             | error          |
      | Sandhya |               | Mobile app for my business | I got 100000 pounds | EMail Required |
      |         | test@test.com | Mobile app for my business | I got 100000 pounds | Name Required  |

    Scenario: Search with valid values

      Given User is on the home page
      When he types "Iphone"
      Then the result should displayed


#    When he clicks on that link
#    Then he should be landed on contact us page
#    When user navigates back
#    When User looks for categories link
#    Then Categories link is present on Home page
#    When he clicks on that link
#    Then he should be landed on categories page

#
#    When User wants to register their details to create an account
#    When he clicks on that link
#    Then he should be landed on contact us page
#    Then Register link is present on home page
#    When User wants to use search box to search for items
#    When he clicks on that link
#    Then he should be landed on contact us page
#    Then search box link is present on home page
#    When User wants to login to their account
#    Then Login link is present on home page
#    When User wants to Post/Request item
#    Then Post/Request item link is present on home page

  @smoke
  Scenario:  Contact Us link is present

    When User looks for contact us link
    Then Contact Us link is present on home page
    When he clicks on that link
    Then he should be landed on contact us page

  @smoke1
  Scenario:  Categories link is present

    When User looks for categories link
    Then Categories link is present on home page

  @smoke
  Scenario:  Register link is present

    When User wants to register their details to create an account
    Then Register link is present on home page


  @smoke
  Scenario: Search box is present

    When User wants to use search box to search for items
    Then search box link is present on home page

  @smoke
  Scenario: Login link is present
    When User wants to login to their account
    Then Login link is present on home page

  @smoke
  Scenario: Post/Request item link is present
    Given User is on the home page
    When User wants to Post/Request item
    Then Post/Request item link is present on home page


##    //-----------------  regression ---/////
#  Scenario:  FAQ link is present
#    Given User is on the  home page
#    When User looks for FAQ link
#    Then FAQ link is present on home page
#
#
#  @reg
#  Scenario: Home page should have the logo of the website and the Title
#    Given User types the right URL
#    When The home page is displayed
#    Then The user is able to view the logo of the website with the title
#
#  @reg
#  Scenario: Home link is visible
#    Given User is on the home page
#    When User looks for Home link
#    Then Home link is present on home page
#
#
#  Scenario: Google link is present
#    Given User is on the home page
#    When User wants to use Google link
#    Then Google link is present on home page
#
#
#  Scenario: Facebook link is present
#    Given User is on the home page
#    When User wants to use Facebook link
#    Then Facebook  link is present on home page
#
#
#  Scenario: Twitter link is present
#    Given User is on the home page
#    When User wants to use Twitter link
#    Then Twitter link is present on home page
#
#  Scenario: Our Sponsors Text is present
#    Given User is on the home page
#    When User wants to view Our sponsors text
#    Then Our Sponsor text is present on home page
#
#  Scenario: Terms and Conditions link is present
#    Given User is on the home page
#    When User wants to view Terms and Conditions
#    Then Terms and Conditions link is present on home page
#
#  Scenario: Share Your Experience text is visible
#    Given User is on the home page
#    When User looks for Share Your Experience text
#    Then Share Your Experience text is present on home page
#
#  Scenario: Latest News text is visible
#    Given User is on the home page
#    When User looks for Latest News text
#    Then Latest text is present on home page
#
#  Scenario: Recent Items link is visible
#    Given User is on the home page
#    When User looks for Recent Items
#    Then Recent Items is present on home page
#
#  Scenario: Who We Are link is visible
#    Given User is on the home page
#    When User looks for Who We Are link
#    Then Who We Are linkis present on home page
#
#  Scenario: Why We Are Doing This link is visible
#    Given User is on the home page
#    When User looks for  Why We Are Doing This link
#    Then  Why We Are Doing This link is present on home page
#
#  Scenario: HelpUs/ Join Us link is visible
#    Given User is on the home page
#    When User looks for  HelpUs/ Join Us link
#    Then  HelpUs/ Join Us link  is present on home page
#
#
#  Scenario: Electronics and Gadgets link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for Electronics and Gadgets link
#    Then Electronics and Gadgets link with number of items present in that category is present on home page
#
#  Scenario: Cars and Vehicles link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for Cars and Vehicles link
#    Then Cars and Vehicles link with number of items present in that category is present on home page
#
#  Scenario: Real Estate link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for Real Estate link
#    Then REal Estate link with number of items present in that category is present on home page
#
#  Scenario: Pets and Animals link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for Pets and Animals link
#    Then Pets and Animals link with number of items present in that category is present on home page
#
#  Scenario: Fashion and Beauty link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for  Fashion and Beauty link
#    Then  Fashion and Beauty link with number of items present in that category is present on home page
#
#
#  Scenario: Sports link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for  Sports link
#    Then  Sports link with number of items present in that category is present on home page
#
#  Scenario: Home Appliences link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for  Home Appliences link
#    Then Home Appliences link with number of items present in that category is present on home page
#
#
#  Scenario: Books and Magazines link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for Books and Magazines link
#    Then Books and Magazines link with number of items present in that category is present on home page
#
#
#  Scenario:Jobs and Services link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for Jobs and Services link
#    Then Jobs and Services link with number of items present in that category is present on home page
#
#
#  Scenario:Miscellaneous link is visible with number of items present in that category
#    Given User is on the home page
#    When User looks for Miscellaneous link
#    Then Miscellaneous link with number of items present in that category is present on home page




