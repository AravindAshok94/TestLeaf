package paypalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class AccountSelectionPage extends SeMethods {
	public AccountSelectionPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement eleRadio;
    public AccountSelectionPage verifyFSRadio() {
    	boolean verifySelected = verifySelected(eleRadio);
    	if(!verifySelected) {
    		click(eleRadio);
    	}
    	return this;
    }
    
    @FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNext;
    public SignUpPage clickNext() {
    	click(eleNext);
    	return new SignUpPage();
    }
    
}
