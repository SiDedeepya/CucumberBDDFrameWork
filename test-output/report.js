$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Selenium/Projects/CucumberBDDFramework/src/main/java/com/Features/LoginMaps.feature");
formatter.feature({
  "line": 1,
  "name": "DataTable Facebook Login using Map",
  "description": "",
  "id": "datatable-facebook-login-using-map",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "DataTable Facebook Login using Map Test Scenario",
  "description": "",
  "id": "datatable-facebook-login-using-map;datatable-facebook-login-using-map-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Username and Password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "dedeepyajhanu@gmail.com",
        "Dedeepya123#"
      ],
      "line": 7
    },
    {
      "cells": [
        "abc123@gmail.com",
        "jgjbjhvbjb123"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Click on submit",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableWithMaps.launch_the_url()"
});
formatter.result({
  "duration": 5571038500,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithMaps.username_and_Password(DataTable)"
});
formatter.result({
  "duration": 658922200,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithMaps.click_on_submit()"
});
formatter.result({
  "duration": 932152400,
  "status": "passed"
});
});