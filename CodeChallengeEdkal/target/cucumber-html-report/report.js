$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyApplication.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate google search text-field",
  "description": "",
  "id": "google-search;validate-google-search-text-field",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open browser and luanch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "check homepage and login with valid",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "validate results",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions_APITest.Open_browser_and_luanch_the_application()"
});
formatter.result({
  "duration": 118344133200,
  "error_message": "org.openqa.selenium.WebDriverException: Reached error page: about:neterror?e\u003ddnsNotFound\u0026u\u003dhttps%3A//www.amazon.com/\u0026c\u003dUTF-8\u0026f\u003dregular\u0026d\u003dWe%20can%E2%80%99t%20connect%20to%20the%20server%20at%20www.amazon.com.\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027SATENDRA-PC\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 72.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200103162918, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 1012, moz:profile: C:\\Users\\lukup\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a18c58d0-0acf-4c15-89c6-ffb03da14bae\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:324)\r\n\tat StepDefinition.StepDefinitions_APITest.Open_browser_and_luanch_the_application(StepDefinitions_APITest.java:32)\r\n\tat ✽.Given Open browser and luanch the application(MyApplication.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions_APITest.check_homepage_and_login_with_valid()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions_APITest.validate_results()"
});
formatter.result({
  "status": "skipped"
});
});