package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	
	@And("Click create lead")
	public CreateLeadsPage clickCreateLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleCreateLead);
		return new CreateLeadsPage();	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	
	@And("Click findLeads")
	public FindLeadsPage clickFindLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLead);
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeads;
	
	public MergeLeadPage clickMergeLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleMergeLeads);
		return new MergeLeadPage();
	}

}
