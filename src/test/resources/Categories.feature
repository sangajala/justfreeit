Feature:User can browse item through Categories

  Scenario:User wants to browse sub-categories
    Given User is on home page of Just-freeit
    When User clicks Categories
    Then User should view all the sub-categories

    @SRIRAM1
  Scenario:User can browse Cars from Cars& Vehicles sub-category
    Given User is on the home page
    When he clicks on "Categories" link
    And he clicks on "Cars & Vehicles" link
    And he clicks on "Cars" link
    And he select the first item's location
    Then User should view the location of the selelcted item

  Scenario:User can browse commercial vehicles from Cars& Vehicles in sub-category
    Given User is on home page Just-freeit
    When User Clicks Categories
    And User Clicks Cars&Vehicles
    And User Clicks Commercial vehicles
    And User Clicks for the condition
    And User Clicks for condition-New
    Then User should view all the items which are NEW in condition

  Scenario:User can browse pets&animals from sub-categories
    Given User is on home page Just-freeit
    When User Clicks Categories
    And User Clicks Pets&animals
    And User Clicks Fishes&Aquarium
    And User Clicks on selected item
    And User Clicks on the contact number
    Then User should view the contact number for the selelcted item

