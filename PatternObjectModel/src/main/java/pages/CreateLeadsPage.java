package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLeadsPage extends ProjectMethods {
	public CreateLeadsPage () {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@And("Enter CompanyName as (.*)")
	public CreateLeadsPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFName;
	
	@And("Enter FirstName as (.*)")
	public CreateLeadsPage enterFirstName(String data) {
		type(eleFName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLName;
	
	@And("Enter LastName as (.*)")
	public CreateLeadsPage enterLastName(String data) {
		type(eleLName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@name=\"submitButton\"]")
	private WebElement eleCreateLead;
	
	@And("Click submit button")
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage() ;
	}

}
