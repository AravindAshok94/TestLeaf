package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods {
	public DuplicateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement eleTitle;
	public DuplicateLeadPage verifyPageTitle() {
		getText(eleTitle);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@value='Create Lead']")
	private WebElement eleCreateLead;
	public ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage();
	}

}
