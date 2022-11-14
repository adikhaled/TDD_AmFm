package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonActions;
import common.CommonWaits;

public class HomePage {
	WebDriver driver;
	CommonWaits commonWaits;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		commonWaits=new CommonWaits(driver);
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath = "(//button[@class='OpenQrfButton button-primary'])[1]") WebElement getAQuote;

public void homePageSteps() {
	CommonActions.click(getAQuote);
}

}
