package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_MergeLead";
		testDescription="Merge Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Aravind";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test
	public void mergeLead() throws InterruptedException {
		new LoginPage()
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadSearch()
		.switchToFindLeadWindow()
		.enterMergeFirstName("Babu")
		.clickFindLeads()
		.getLeadIDOne()
		.closeViewLeadWindow()
		.clickToLeadSearch()
		.switchToFindLeadWindow()
		.enterMergeFirstName("Gopi")
		.clickFindLeads()
		.getLeadIDTwo()
		.closeViewLeadWindow()
		.enterFromLead(mergeLeadIDOne)
		.enterToLead(mergeLeadIDTwo)
		.clickMergeLead()
		.acceptMergeAlert()
		.clickFindLeads()
		.enterLeadId(mergeLeadIDOne)
		.clickFindLeads()
		.verifyErrorMessage();
	}

}
