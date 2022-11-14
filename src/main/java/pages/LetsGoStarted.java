package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class LetsGoStarted {

	public LetsGoStarted(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@name='zipCode']") WebElement zipCode;
	@FindBy(xpath = "//span[text()=' Home ']") WebElement home;
	@FindBy(className = "LoadingButton__content") WebElement letsGo;
	
	public void letsGoStartedSteps() {
		CommonActions.input(zipCode, "11230");
		CommonActions.click(home);
		CommonActions.click(letsGo);
	}
}
