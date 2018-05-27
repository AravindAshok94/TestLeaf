package paypalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class HomePage extends SeMethods {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	  @FindBy(how=How.ID,using="signup-button")
	  private WebElement eleSignUp;
      public AccountSelectionPage clickSignUp() {
    	  click(eleSignUp);
    	  return new AccountSelectionPage();
    	  
      }
      
}
