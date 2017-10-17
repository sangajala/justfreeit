$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Categories.feature");
formatter.feature({
  "line": 1,
  "name": "User can browse item through Categories",
  "description": "",
  "id": "user-can-browse-item-through-categories",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 9,
  "name": "User can browse Cars from Cars\u0026 Vehicles sub-category",
  "description": "",
  "id": "user-can-browse-item-through-categories;user-can-browse-cars-from-cars\u0026-vehicles-sub-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@SRIRAM1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "he clicks on \"Categories\" link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "he clicks on \"Cars \u0026 Vehicles\" link",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "he clicks on \"Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "he select the first item\u0027s location",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should view the location of the selelcted item",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.userIsOnTheHomePage()"
});
formatter.result({
  "duration": 329940457,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Categories",
      "offset": 14
    }
  ],
  "location": "Stepdefs.heClicksOnLink(String)"
});
formatter.result({
  "duration": 687079634,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cars \u0026 Vehicles",
      "offset": 14
    }
  ],
  "location": "Stepdefs.heClicksOnLink(String)"
});
formatter.result({
  "duration": 1155662274,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cars",
      "offset": 14
    }
  ],
  "location": "Stepdefs.heClicksOnLink(String)"
});
formatter.result({
  "duration": 425412048,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.heSelectTheFirstItemSLocation()"
});
formatter.result({
  "duration": 151809509,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.userShouldViewTheLocationOfTheSelelctedItem()"
});
formatter.result({
  "duration": 181095041,
  "status": "passed"
});
});