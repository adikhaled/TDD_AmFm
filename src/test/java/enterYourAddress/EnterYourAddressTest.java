package enterYourAddress;

import org.testng.annotations.Test;

import base.BaseClass;

public class EnterYourAddressTest extends BaseClass {
	
	@Test
	public void enterYourAddressTest() {
		
		homePage.homePageSteps();
		EnterYourAddressTest.enterYourTestSteps();
		
	}

	private static void enterYourTestSteps() {
		
	}

}
