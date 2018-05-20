package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_DuplicateLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC003_DuplicateLead";
		testDescription="Duplicate Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Aravind";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test
	public void duplicateLead() throws InterruptedException {
		new LoginPage()
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmailAddress("@gmail.com")
		.clickFindLeads()
		.getFirstResult()
		.clickFirstResult()
		.clickDuplicateLead()
		.verifyPageTitle()
		.clickCreateLead()
		.verifyFirstName(firstResLeadName);
	}

}
