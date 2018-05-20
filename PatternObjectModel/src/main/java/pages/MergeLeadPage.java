package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods {
	public MergeLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//a[@href=\"javascript:call_fieldlookup2autocomplete(document.getElementById('ComboBox_partyIdFrom'),document.getElementById('partyIdFrom'),'LookupLeads');\"]")
	private WebElement eleFromLeadSearch;
	public MergeLeadPage clickFromLeadSearch() {
	   click(eleFromLeadSearch);
	   return this;
	}
	
	public FindLeadsPage switchToFindLeadWindow() {
		switchToWindow(1);
		return new FindLeadsPage();
	}
	
	@FindBy(how=How.XPATH,using="//a[@href=\"javascript:call_fieldlookup2autocomplete(document.getElementById('ComboBox_partyIdTo'),document.getElementById('partyIdTo'),'LookupLeads');\"]")
	private WebElement eleToLeadSearch;
	public MergeLeadPage clickToLeadSearch() {
	   click(eleToLeadSearch);
	   return this;
	}
	@FindBy(how=How.XPATH,using="//table/tbody/tr/td/input[@name='ComboBox_partyIdFrom']")
	private WebElement eleFromLead;
	public MergeLeadPage enterFromLead(String data) {
		type(eleFromLead,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr/td/input[@name='ComboBox_partyIdTo']")
	private WebElement eleToLead;
	public MergeLeadPage enterToLead(String data) {
		type(eleToLead,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[@class=\"buttonDangerous\"]")
	private WebElement eleMerge;
	public MergeLeadPage clickMergeLead() {
		click(eleMerge);
		return this;
	}
	public ViewLeadPage acceptMergeAlert() {
		acceptAlert();
		return new ViewLeadPage();
	}

}
