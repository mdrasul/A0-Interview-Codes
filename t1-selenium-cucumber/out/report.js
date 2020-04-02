$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("multicart_user_accounts.feature");
formatter.feature({
  "line": 1,
  "name": "User My Account Activities",
  "description": "As a User I want to check all my accounts realtd options\nSO i can perform all activities",
  "id": "user-my-account-activities",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1654902,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Langing on MCT Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I land on multicart landing page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I complete login with James valid credentails",
  "keyword": "And "
});
formatter.match({
  "location": "CommonSteps.i_open_browser_chrome()"
});
formatter.result({
  "duration": 4375103334,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.i_land_on_multicart_landing_page()"
});
formatter.result({
  "duration": 5059413444,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_complete_login_for_James_valid_credentails()"
});
formatter.result({
  "duration": 5343750328,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "#Scenario: User Sees individual account option"
    },
    {
      "line": 11,
      "value": "#When I navigate to my Account page"
    },
    {
      "line": 12,
      "value": "#Then I see options \"My Orders\" available"
    },
    {
      "line": 13,
      "value": "#Then I see options \"Profile\" available"
    },
    {
      "line": 14,
      "value": "#Then I see options \"My Return Requests\" available"
    },
    {
      "line": 15,
      "value": "#Then I see options \"Change Password\" available"
    }
  ],
  "line": 17,
  "name": "User Sees all Account Options",
  "description": "",
  "id": "user-my-account-activities;user-sees-all-account-options",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I navigate to my Account page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I see all aviable options below",
  "rows": [
    {
      "cells": [
        "My Orders"
      ],
      "line": 20
    },
    {
      "cells": [
        "Profile"
      ],
      "line": 21
    },
    {
      "cells": [
        "My Return Requests"
      ],
      "line": 22
    },
    {
      "cells": [
        "Change Password-X-"
      ],
      "line": 23
    },
    {
      "cells": [
        "My Favorite Products"
      ],
      "line": 24
    },
    {
      "cells": [
        "My Favorite Sellers"
      ],
      "line": 25
    },
    {
      "cells": [
        "Seller Dashboard"
      ],
      "line": 26
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountSteps.i_navigate_to_my_Account_page()"
});
formatter.result({
  "duration": 1769772641,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.i_see_all_aviable_options_below(DataTable)"
});
formatter.result({
  "duration": 408949812,
  "error_message": "java.lang.AssertionError: \nExpected: \u003c[My Orders, Profile, My Return Requests, Change Password, My Favorite Products, My Favorite Sellers, Seller Dashboard]\u003e\n     but: was \u003c[My Orders, Profile, My Return Requests, Change Password-X-, My Favorite Products, My Favorite Sellers, Seller Dashboard]\u003e\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)\n\tat multicard.steps.defination.MyAccountSteps.i_see_all_aviable_options_below(MyAccountSteps.java:65)\n\tat ✽.Then I see all aviable options below(multicart_user_accounts.feature:19)\n",
  "status": "failed"
});
formatter.after({
  "duration": 290309079,
  "status": "passed"
});
});