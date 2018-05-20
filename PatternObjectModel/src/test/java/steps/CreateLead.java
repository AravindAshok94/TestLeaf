package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	/*static RemoteWebDriver driver;
	@Given("Open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Given("launch the site")
	public void launchTheSite() {
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("Enter the UserName")
	public void enterUserName() {
		driver.findElementById("username").sendKeys("DemoCSR");
	}
	@And("Enter the Password")
	public void enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	@And("click Login")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("click CRMSFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click Leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click create lead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter CompanyName as (.*)")
	public void enterCompanyName(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	@And("Enter FirstName as (.*)")
	public void enterFirstName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	@And("Enter LastName as (.*)")
	public void enterLastName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	@When("Click submit button")
	public void clickCreateLeadButton() {
		driver.findElementByXPath(".//*[@name='submitButton']").click();
	}
	@But("Verify error message")
	public void verifyFailureMessage() {
		System.out.println("Error message displayed");
	}
	@Then("Verify first name")
	public void verifyLeadName() {
		System.out.println("Create lead successful");
		driver.close();
	}*/

}
