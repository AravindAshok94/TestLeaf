package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement eleLastName;
	
	@And("Update last name as (.*)")
	public EditLeadPage updateLastName(String data) {
		type(eleLastName,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@value='Update']")
	private WebElement eleUpdate;
	
	@And("Click update")
	public ViewLeadPage clickUpdate() {
		click(eleUpdate);
		return new ViewLeadPage();
	}

}
