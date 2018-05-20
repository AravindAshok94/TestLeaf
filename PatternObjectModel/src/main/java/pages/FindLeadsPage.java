package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);	
	}
	public FindLeadsPage refreshElements() {
		PageFactory.initElements(driver, this);
		return this;
	}
	@FindBy(how=How.XPATH,using="(.//*[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	@And("Enter first name as (.*)")
	public FindLeadsPage enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	@And("Click findButton")
	public FindLeadsPage clickFindLeads() throws InterruptedException {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLeads);
		Thread.sleep(3000);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//table[@class=\"x-grid3-row-table\"]/tbody/tr/td/div/a)[1]")
	private WebElement eleFirstResult;
	
	@And("Click first result")
	public ViewLeadPage clickFirstResult() {
		click(eleFirstResult);
		return new ViewLeadPage();
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Email")
	private WebElement eleEmail;
	
	public  FindLeadsPage clickEmailTab() {
		click(eleEmail);
		return this;
		}
	
	@FindBy(how=How.ID_OR_NAME,using="emailAddress")
	private WebElement eleEmailAddress;
	
	public FindLeadsPage enterEmailAddress(String data) {
		type(eleEmailAddress, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a)[1]")
	private WebElement eleFirstResultName;
	public  FindLeadsPage getFirstResult() {
		firstResLeadName = getText(eleFirstResultName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//table[@class=\"x-grid3-row-table\"]/tbody/tr/td/div/a)[1]")
	private WebElement eleLeadIDOne;
	public  FindLeadsPage getLeadIDOne() {
		mergeLeadIDOne = getText(eleLeadIDOne);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//table[@class=\"x-grid3-row-table\"]/tbody/tr/td/div/a)[1]")
	private WebElement eleLeadIDTwo;
	public  FindLeadsPage getLeadIDTwo() {
		mergeLeadIDTwo = getText(eleLeadIDTwo);
		return this;
	}
	public MergeLeadPage closeViewLeadWindow() {
		closeBrowser();
		switchToWindow(0);
		return new MergeLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//div[@class=\"x-paging-info\"]")
	private WebElement eleErrorMessage;
	
	@And("Verify error message")
	public FindLeadsPage verifyErrorMessage() {
		verifyExactText(eleErrorMessage,"No records to display");
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleLeadId;
	
	@And("Enter delete lead ID as (.*)")
	public FindLeadsPage enterLeadId(String data) {
		type(eleLeadId, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(.//*[@name='firstName'])")
	private WebElement eleMergeFirstName;
	
	public FindLeadsPage enterMergeFirstName(String data) {
		type(eleMergeFirstName, data);	
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Phone")
	private WebElement elePhone;
	
	@And("Click phone tab")
	public  FindLeadsPage clickPhoneTab() {
		click(elePhone);
		return this;
		}
	@FindBy(how=How.XPATH,using="//input[@name=\"phoneNumber\"]")
	private WebElement elePhoneNumber;
	
	@And("Enter phone number as (.*)")
	public FindLeadsPage enterPhoneNumber(String data){
		type(elePhoneNumber,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//table[@class=\"x-grid3-row-table\"]/tbody/tr/td/div/a)[1]")
	private WebElement eleDeleteLeadID;
	
	@And("Get lead ID to be deleted")
	public  FindLeadsPage getDeleteLeadID() {
		deleteLeadID = getText(eleDeleteLeadID);
		return this;
	}

}
