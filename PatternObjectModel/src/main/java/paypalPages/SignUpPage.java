package paypalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class SignUpPage extends SeMethods {
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="country")
	private WebElement eleCountry;
   public SignUpPage selectCountry(String data) {
	   selectDropDownUsingText(eleCountry, data);
	   return this;
   }
   @FindBy(how=How.ID,using="email")
   private WebElement eleEmail;
   public SignUpPage enterEmail(String data) {
	   type(eleEmail,data);
	   return this;
   }
   
   @FindBy(how=How.ID,using="password")
   private WebElement elePassword;
   public SignUpPage enterPassword(String data) {
	   type(elePassword,data);
	   return this;
   }
   
   @FindBy(how=How.ID,using="confirmPassword")
   private WebElement eleConfirmPassword;
   public SignUpPage enterConfirmPassword(String data) {
	   type(eleConfirmPassword,data);
	   return this;
   }
   @FindBy(how=How.ID,using="_eventId_personal")
   private WebElement eleContinue;
   public void clicContinue() {
	   click(eleContinue);
   }
}
