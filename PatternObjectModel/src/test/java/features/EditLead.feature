Feature: Edit lead details with given data

@Regression
Scenario Outline: Edit lead Name

Given Enter the UserName as <uName>
And Enter the Password as <pWord>
And Click login
And Click CRMSFA
And Click Leads
And Click findLeads
And Enter first name as <fName>
And Click findButton
And Click first result
And click edit lead
And Update last name as <lName>
When Click update
Examples:
|uName|pWord|fName|lName|
|DemoSalesManager|crmsfa|Balaji|Update|