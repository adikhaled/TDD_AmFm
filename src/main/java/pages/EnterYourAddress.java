package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class EnterYourAddress {
	WebDriver driver;

	public EnterYourAddress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='line1']")
	WebElement address;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	@FindBy(xpath = "//input[@id='zip']")
	WebElement zipCode;
	@FindBy(xpath = "(//span[@class='MuiButton-label'])[2]")
	WebElement getQout;

	public void enterYourAddressSteps() throws InterruptedException {
		CommonActions.input(address, "1202 Avenue K");
		CommonActions.input(city, "Brooklyn");
		CommonActions.input(state, "New York");
		CommonActions.input(zipCode, "11230");
		CommonActions.click(getQout);
		Thread.sleep(5000);
	}

}
