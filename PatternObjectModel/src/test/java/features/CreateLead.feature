Feature: Create a lead with given data

@smoke
Scenario Outline: Create Lead with mandatory data


Given Enter the UserName as <uName>
And Enter the Password as <pWord>
And Click login
And Click CRMSFA
And Click Leads
And Click create lead
And Enter CompanyName as <CompanyName>
And Enter FirstName as <FirstName>
And Enter LastName as <LastName>
When Click submit button
Then Verify first name as <FirstName>

Examples:
|CompanyName|FirstName|LastName|uName|pWord|
|CTS|Balaji|Justin|DemoCSR|crmsfa|
|CTS|Balaji|UK|DemoCSR|crmsfa|

