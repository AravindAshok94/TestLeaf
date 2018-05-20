package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="Create Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Aravind";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pWord, String cName,String fName,String lName) {
		new LoginPage()
		.enterUserName(uName).
		enterPassword(pWord).
		clickLogIn().
		clickCRMSFA().
		clickLeads().
		clickCreateLead().
		enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead().verifyLeadName(fName);
		
	}

}
