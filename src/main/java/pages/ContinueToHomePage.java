package pages;

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
public class ContinueToHomePage {
	WebDriver driver;

	public ContinueToHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "button-dep ")
	WebElement continueToHome;


	public void aboutAutoSteps() {
		((JavascriptExecutor) driver).executeScript("document.getElementById('continueToHome').click();");
		click(continueToHome);
		

		
	}
}