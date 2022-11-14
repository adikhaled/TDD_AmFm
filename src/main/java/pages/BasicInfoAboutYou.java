package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class BasicInfoAboutYou {
	public BasicInfoAboutYou(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='dateOfBirth']")
	WebElement dateOfBirth;
	@FindBy(xpath = "(//span[@class='MuiButton-label'])[1]")
	WebElement continuElement;

	
	public void basicInfoAboutYouSteps() {
		CommonActions.input(firstName,"Khaled");
		CommonActions.input(lastName, "Adi");
		CommonActions.input(email, "Khldzmnd@gmail.com");
		CommonActions.input(dateOfBirth,"10/20/19996");
		CommonActions.click(continuElement);
		
	}

}
