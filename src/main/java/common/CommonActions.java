package common;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import reporting.Logs;

public class CommonActions {

	public static void click(WebElement element) {
		try {
			element.click();
			Logs.log(element + " <--- has been clicked");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND ---> " + element);
			Assert.fail();
		}
	}

	public static void input(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + " : has been passed to ---> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND ---> " + element);
			Assert.fail();
		}
	}

	public static boolean isPresent(WebElement element) {
		try {
			element.isEnabled();
			Logs.log(element + " <--- has been PRESENT");
			return true;
		} catch (NoSuchElementException | NullPointerException e) {
			Logs.log("ELEMENT NOT FOUND -->" + element);
			return false;
		}
	}
	public static void clear(WebElement element) {
		try {
			element.clear();
			Logs.log("Clearing element ---> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND ---> " + element);
			fail();
		}
	}
	
	public static boolean isDisplayed(WebElement element) {
		if(element.isDisplayed()) {
			Logs.log(element + " <--- is VISIBLE");
			return true;
		}else {
			Logs.log(element + " <--- NOT VISIBLE");
			return false;
		}
	}
	public static void assertGetText(WebElement element, String expected) {
		if(element != null) {
			Logs.log(element + " <--- has text = " + element.getText());
			assertEquals(element.getText(), expected);
		}else {
			Logs.log("ELEMENT NOT FOUND -->" + element);
			fail();
		}
	}
	public static void sleep(int secs) {
		try {
			Thread.sleep(secs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectDropdown(WebElement element,String value) {
		try {
			Select select = new Select(element);
			select.selectByValue(value);
			Logs.log(value + " : has been selected for ---> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND -->" + element);
			fail();
		}
	}

}
