Feature: Login with Leaftaps application

Scenario: Login valid Credentials

Given Open the chrome browser
And Load the application url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed

Scenario: Login Invalid Credentials

Given Open the chrome browser
And Load the application url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa1234'
When Click on Login button
But The error should be displayed
