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
      "name": "@SRIRAM"
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
  "duration": 1023181163,
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
  "duration": 752563983,
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
  "duration": 657193697,
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
  "duration": 440788351,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.heSelectTheFirstItemSLocation()"
});
formatter.result({
  "duration": 150316025,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.userShouldViewTheLocationOfTheSelelctedItem()"
});
formatter.result({
  "duration": 523602941,
  "status": "passed"
});
formatter.uri("Deva.feature");
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
  "duration": 795802472,
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
  "duration": 491987661,
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
  "duration": 137676058,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.userNavigatesBack()"
});
formatter.result({
  "duration": 323811202,
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
  "duration": 674668174,
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
  "duration": 406527581,
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
  "duration": 129461930,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.userNavigatesBack()"
});
formatter.result({
  "duration": 351478794,
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
  "duration": 732626923,
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
  "duration": 552289169,
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
  "duration": 189764465,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.userNavigatesBack()"
});
formatter.result({
  "duration": 322432233,
  "status": "passed"
});
});            formatter.result({
  "duration": 30042134800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"//img[@alt\u003d\u0027Logo\u0027]\"}\n  (Session info: chrome\u003d61.0.3163.100)\n  (Driver info: chromedriver\u003d2.32.498537 (cb2f855cbc7b82e20387eaf9a43f6b99b6105061),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027Srirams-MacBook-Pro-2.local\u0027, ip: \u0027192.168.0.11\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dMAC, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.32.498537 (cb2f855cbc7b82e20387eaf9a43f6b99b6105061), userDataDir\u003d/var/folders/7m/6_w0bn_x0vl5cwqjlkhfvzdm0000gn/T/.org.chromium.Chromium.aZSJNB}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d61.0.3163.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7c8a4aaae888a10398a0954660378718\n*** Element info: {Using\u003did, value\u003d//img[@alt\u003d\u0027Logo\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:462)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\n\tat pages.HomePage.gotohomepage(HomePage.java:62)\n\tat Stepdefs.userIsOnTheHomePage(Stepdefs.java:21)\n\tat ✽.Given User is on the home page(Deva.feature:9)\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefs.userNavigatesBack()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 30062068866,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"//img[@alt\u003d\u0027Logo\u0027]\"}\n  (Session info: chrome\u003d61.0.3163.100)\n  (Driver info: chromedriver\u003d2.32.498537 (cb2f855cbc7b82e20387eaf9a43f6b99b6105061),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027Srirams-MacBook-Pro-2.local\u0027, ip: \u0027192.168.0.11\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dMAC, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.32.498537 (cb2f855cbc7b82e20387eaf9a43f6b99b6105061), userDataDir\u003d/var/folders/7m/6_w0bn_x0vl5cwqjlkhfvzdm0000gn/T/.org.chromium.Chromium.aZSJNB}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d61.0.3163.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7c8a4aaae888a10398a0954660378718\n*** Element info: {Using\u003did, value\u003d//img[@alt\u003d\u0027Logo\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:462)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\n\tat pages.HomePage.gotohomepage(HomePage.java:62)\n\tat Stepdefs.userIsOnTheHomePage(Stepdefs.java:21)\n\tat ✽.Given User is on the home page(Deva.feature:9)\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefs.userNavigatesBack()"
});
formatter.result({
  "status": "skipped"
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
  "duration": 30014490257,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"//img[@alt\u003d\u0027Logo\u0027]\"}\n  (Session info: chrome\u003d61.0.3163.100)\n  (Driver info: chromedriver\u003d2.32.498537 (cb2f855cbc7b82e20387eaf9a43f6b99b6105061),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027Srirams-MacBook-Pro-2.local\u0027, ip: \u0027192.168.0.11\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dMAC, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.32.498537 (cb2f855cbc7b82e20387eaf9a43f6b99b6105061), userDataDir\u003d/var/folders/7m/6_w0bn_x0vl5cwqjlkhfvzdm0000gn/T/.org.chromium.Chromium.aZSJNB}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d61.0.3163.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 7c8a4aaae888a10398a0954660378718\n*** Element info: {Using\u003did, value\u003d//img[@alt\u003d\u0027Logo\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:462)\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\n\tat pages.HomePage.gotohomepage(HomePage.java:62)\n\tat Stepdefs.userIsOnTheHomePage(Stepdefs.java:21)\n\tat ✽.Given User is on the home page(Deva.feature:9)\n",
  "status": "failed"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefs.userNavigatesBack()"
});
formatter.result({
  "status": "skipped"
});
});