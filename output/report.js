$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Deva.feature");
formatter.feature({
  "line": 1,
  "name": "Check that homepage have all expected feature",
  "description": "",
  "id": "check-that-homepage-have-all-expected-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#  Background:"
    },
    {
      "line": 4,
      "value": "#    Given User is on the home page"
    }
  ],
  "line": 7,
  "name": "Major links are visible",
  "description": "",
  "id": "check-that-homepage-have-all-expected-feature;major-links-are-visible",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@SRIRAM"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "he clicks on \"\u003ccol\u003e\" link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "he should be landed on page with text \"\u003cText\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user navigates back",
  "keyword": "When "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "check-that-homepage-have-all-expected-feature;major-links-are-visible;",
  "rows": [
    {
      "cells": [
        "col",
        "Text"
      ],
      "line": 16,
      "id": "check-that-homepage-have-all-expected-feature;major-links-are-visible;;1"
    },
    {
      "cells": [
        "About Us",
        "Lorem ipsum dolor sit amet, consectetur adipisicing elit sed do"
      ],
      "line": 17,
      "id": "check-that-homepage-have-all-expected-feature;major-links-are-visible;;2"
    },
    {
      "cells": [
        "Contact Us",
        "Send Us Your Feedback"
      ],
      "line": 18,
      "id": "check-that-homepage-have-all-expected-feature;major-links-are-visible;;3"
    },
    {
      "cells": [
        "Categories",
        "Recent Adds"
      ],
      "line": 19,
      "id": "check-that-homepage-have-all-expected-feature;major-links-are-visible;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Major links are visible",
  "description": "",
  "id": "check-that-homepage-have-all-expected-feature;major-links-are-visible;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@SRIRAM"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "he clicks on \"About Us\" link",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "he should be landed on page with text \"Lorem ipsum dolor sit amet, consectetur adipisicing elit sed do\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user navigates back",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.userIsOnTheHomePage()"
});
formatter.result({
  "duration": 495977076,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "About Us",
      "offset": 14
    }
  ],
  "location": "Stepdefs.heClicksOnLink(String)"
});
formatter.result({
  "duration": 6376993244,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lorem ipsum dolor sit amet, consectetur adipisicing elit sed do",
      "offset": 39
    }
  ],
  "location": "Stepdefs.heShouldBeLandedOnPageWithText(String)"
});
formatter.result({
  "duration": 238631966,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.userNavigatesBack()"
});
formatter.result({
  "duration": 458762792,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Major links are visible",
  "description": "",
  "id": "check-that-homepage-have-all-expected-feature;major-links-are-visible;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@SRIRAM"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "he clicks on \"Contact Us\" link",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "he should be landed on page with text \"Send Us Your Feedback\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user navigates back",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.userIsOnTheHomePage()"
});
formatter.result({
  "duration": 442709757,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact Us",
      "offset": 14
    }
  ],
  "location": "Stepdefs.heClicksOnLink(String)"
});
formatter.result({
  "duration": 558247508,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Send Us Your Feedback",
      "offset": 39
    }
  ],
  "location": "Stepdefs.heShouldBeLandedOnPageWithText(String)"
});
formatter.result({
  "duration": 170613277,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.userNavigatesBack()"
});
formatter.result({
  "duration": 295267961,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Major links are visible",
  "description": "",
  "id": "check-that-homepage-have-all-expected-feature;major-links-are-visible;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@SRIRAM"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "he clicks on \"Categories\" link",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "he should be landed on page with text \"Recent Adds\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user navigates back",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.userIsOnTheHomePage()"
});
formatter.result({
  "duration": 450560484,
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
  "duration": 823556058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Recent Adds",
      "offset": 39
    }
  ],
  "location": "Stepdefs.heShouldBeLandedOnPageWithText(String)"
});
formatter.result({
  "duration": 190012396,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.userNavigatesBack()"
});
formatter.result({
  "duration": 339950398,
  "status": "passed"
});
});