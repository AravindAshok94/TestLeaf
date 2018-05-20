package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Aravind";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pWord,String phone) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pWord)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(phone)
		.clickFindLeads()
		.getDeleteLeadID()
		.clickFirstResult()
		.clickDeleteButton()
		.clickFindLeads()
		.enterLeadId(deleteLeadID)
		.clickFindLeads()
		.verifyErrorMessage();
	}

}
