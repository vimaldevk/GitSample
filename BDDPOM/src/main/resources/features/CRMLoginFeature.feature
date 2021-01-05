Feature: CRM Login

Scenario: Free CRM Login
Given User is already on Login Page
And title of login page is Free CRM
When User enters login Credentials
Then User is on Home page
Then close the Browser