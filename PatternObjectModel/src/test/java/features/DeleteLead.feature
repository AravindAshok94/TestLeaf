Feature: Delete lead using given data

@Sanity
Scenario Outline: Delete lead using phoneNumber

Given Enter the UserName as <uName>
And Enter the Password as <pWord>
And Click login
And Click CRMSFA
And Click Leads
And Click findLeads
And Click phone tab
And Enter phone number as <pNumber>
And Click findButton
And Get lead ID to be deleted
And Click first result
And Clck delete button
And Click findLeads
And Enter delete lead ID as <deleteLeadID>
When Click findButton
Then Verify error message

Examples:
|uName|pWord|pNumber|
|DemoSalesManager|crmsfa|123|