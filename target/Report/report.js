$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login User",
  "description": "fitur untuk user melakukan login",
  "id": "login-user",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User berada pada Main Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User berada di Main Page \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com/",
      "offset": 26
    }
  ],
  "location": "Login.user_berada_di_Main_Page(String)"
});
formatter.result({
  "duration": 25970425637,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Normal Skenario - User login",
  "description": "",
  "id": "login-user;normal-skenario---user-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User melakukan hover pada menu Account\u0026Lists di Main Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User mengklik tombol Sign In pada menu Account\u0026Lists di Main Page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User berada pada Sign In Page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User mengisi email pada textbox Email \"satrioajiewijaya@gmail.com\" pada Sign In Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User mengklik tombol Continue pada Sign In Page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User mengisi email pada textbox Password \"Gekiku24\" pada Sign In Page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User mengklik tombol Sign In pada Sign In Page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User berada di Main Page \"https://www.amazon.com/\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Nama user \"satrio\" muncul pada menu Account\u0026Lists di Main Page",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_melakukan_hover_pada_menu_Account_Lists_di_Main_Page()"
});
formatter.result({
  "duration": 6126789180,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_mengklik_tombol_Sign_In_pada_menu_Account_Lists_di_Main_Page()"
});
formatter.result({
  "duration": 2014492217,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_berada_pada_Sign_In_Page()"
});
formatter.result({
  "duration": 99721221,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "satrioajiewijaya@gmail.com",
      "offset": 39
    }
  ],
  "location": "Login.user_mengisi_email_pada_textbox_Email_pada_Sign_In_Page(String)"
});
formatter.result({
  "duration": 103860243,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_mengklik_tombol_Continue_pada_Sign_In_Page()"
});
formatter.result({
  "duration": 2430034740,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gekiku24",
      "offset": 42
    }
  ],
  "location": "Login.user_mengisi_email_pada_textbox_Password_pada_Sign_In_Page(String)"
});
formatter.result({
  "duration": 81578710,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_mengklik_tombol_Sign_In_pada_Sign_In_Page()"
});
formatter.result({
  "duration": 10257867243,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com/",
      "offset": 26
    }
  ],
  "location": "Login.user_berada_di_Main_Page(String)"
});
formatter.result({
  "duration": 94854,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "satrio",
      "offset": 11
    }
  ],
  "location": "Login.nama_user_muncul_pada_menu_Account_Lists_di_Main_Page(String)"
});
formatter.result({
  "duration": 66283936,
  "status": "passed"
});
});