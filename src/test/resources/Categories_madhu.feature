Feature: User can access the items the Categories
As a User
I want to access the items through categories.
So that i can view the items

  Scenario: User can access the sub_categories
  Given User should be on Bananapps Home page
  When User clicks on categories menu
  Then User can view the all Sub-categories.
  
  Scenario: User can access the laptops & Computers from Electronics & Gadgets sub-category. 
  Given User should be on Bananapps Home page
  When When User clicks on categories menu
  And User clicks on Electronics & Gadgets
  And User clicks on Laptop & Computers
  And User can clicks the selected item.
  Then User can view the item from Electonics & Gadgets.
  
  Scenario: User can access Mobile phones from Electronics & Gadgets sub-category. 
  Given User should be on Bananapps Home page
  When When User clicks on categories menu
  And User clicks  Electronics & Gadgets
  And User clicks Mobile phones
  And User clicks the selected Item
  And User clicks the contact number of the selected item 
  Then User can view the contact number of the selected item.
  
  Scenario: User can access the Houses from Real Estate sub-category. 
  Given User should be on Bananapps Home page
  When When User clicks on categories menu
  And User clicks Real Estate
  And User clicks Houses
  And User clicks the location of the selected Item
  Then User can view the location of the selected item.
  
  Scenario: User can access the sports from sub-category.
  Given User should be on Bananapps Home page
  When When User clicks on categories menu
  And User clicks Sports
  And User clicks the condition-used
  Then User can view the selected condition items.
  
  
  
  
  
  
  
  
