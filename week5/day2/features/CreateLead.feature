Feature: Login with Leaftaps application

@regression
Scenario Outline: To crete a new lead with mandatory field

Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then HomePage should be displayed
When Click on crmsfa hyper link
Then MyHomePage should be displayed
When click on leads tap
Then MyLeadsPage should be displayed
When Click on create Lead button
Then CreateLead pages should be displayed
Given Enter the companyName as <companyName>
And Enter the FirstName as <firstName>
And Enter the LastName as <lastName>
When Click on CreateLead submit button
Then ViewLeadPage should be displayed 

Examples:
|username|password|companyName|firstName|lastName|
|Demosalesmanager|crmsfa|Infosys|Aravind|RK|
|Demosalesmanager|crmsfa|Infosys|Raghu|G|