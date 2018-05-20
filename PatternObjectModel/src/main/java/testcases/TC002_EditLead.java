package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {

		@BeforeTest
		public void setData() {
			testCaseName="TC002_EditLead";
			testDescription="Edit Lead";
			testNodes="Leads";
			category="Sanity";
			authors="Aravind";
			browserName="chrome";
			dataSheetName="TC002";
			}
		@Test(dataProvider="fetchData")
		public void editLead(String uName,String pWord,String fName,String lName) throws InterruptedException {
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pWord)
			.clickLogIn()
			.clickCRMSFA()
			.clickLeads()
			.clickFindLeads()
			.enterFirstName(fName)
			.clickFindLeads()
			.refreshElements()
			.clickFirstResult()
			.clickEditLead()
			.updateLastName(lName)
			.clickUpdate();

	}

}
