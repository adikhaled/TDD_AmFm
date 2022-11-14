package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasicInfoAboutYou;
import pages.ContinueToHomePage;
import pages.HomePage;
import pages.LetsGoStarted;
import utils.Configuration;
import static utils.IConstant.*;
import java.util.concurrent.TimeUnit;
public class BaseClass {

	Configuration config = new Configuration();
	protected HomePage homePage;
	protected LetsGoStarted letsGoStarted;
	protected ContinueToHomePage continueToHomePage;
	protected BasicInfoAboutYou basicInfoAboutYou;
	WebDriver driver;

	@BeforeMethod
	public void setUpDriver() {
		WebDriverManager.chromedriver().setup();
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("enable-features=NetworkServiceInProcess");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.farmers.com/");
		driver.get(config.getProperty((URL))); 
		long pageLoadTime = Long.parseLong(config.getProperty(PAGELOAD_WAIT));
		long implicitwait = Long.parseLong(config.getProperty(IMPLICIT_WAIT));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait));
		//driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageLoadTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(implicitwait, TimeUnit.SECONDS);
		init();
	}
    private void init() {
    	homePage=new HomePage(driver);
    	letsGoStarted=new LetsGoStarted(driver);
    	continueToHomePage =new ContinueToHomePage(driver);
    	//enterYourAddress = new EnterYourAddress(driver);
    }
    
	public WebDriver getDriver() {
		return driver;
	}
	
	@AfterMethod
	public void closingTheDriverSession() {
		getDriver().quit();
	}

}
