Feature: Login with Leaftaps application

#Background:
#Given Open the chrome browser
#And Load the application url
@SmokeTestcase
Scenario Outline: Login valid Credentials
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then HomePage should be displayed
Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@Sanitytestcase
Scenario: Login Invalid Credentials
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa1234'
When Click on Login button
But The error should be displayed
