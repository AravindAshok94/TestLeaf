package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleViewLead;
	
	@And("Verify first name as (.*)")
	public ViewLeadPage verifyLeadName(String data) {
		verifyExactText(eleViewLead, data);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditLead;
	
	@And("click edit lead")
	public EditLeadPage clickEditLead() {
		click(eleEditLead);
		return new EditLeadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLead;
	
	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicateLead);
		return new DuplicateLeadPage();
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	
	public FindLeadsPage clickFindLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLead);
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.XPATH,using="//a[@class=\"subMenuButtonDangerous\"]")
	private WebElement eleDeleteLead;
	
	@And("Clck delete button")
	public MyLeadsPage clickDeleteButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleDeleteLead);
		return new MyLeadsPage();
	}
	

}
