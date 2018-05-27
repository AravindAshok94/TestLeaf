package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import paypalPages.HomePage;
import wdMethods.ProjectMethods;

public class PaypalTestCase extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="Paypal";
		testDescription="Create account";
		testNodes="Leads";
		category="Smoke";
		authors="Aravind";
		browserName="chrome";
		dataSheetName="paypal";
	}
	
	@Test(dataProvider="fetchData")
	public void run(String country,String email,String password,String cPassword) {
		new HomePage()
		.clickSignUp()
		.verifyFSRadio()
		.clickNext()
		.selectCountry(country)
		.enterEmail(email)
		.enterPassword(password)
		.enterConfirmPassword(cPassword)
		.clicContinue();
	}
	

}
