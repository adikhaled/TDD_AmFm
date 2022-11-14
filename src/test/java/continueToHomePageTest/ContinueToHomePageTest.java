package continueToHomePageTest;

import org.testng.annotations.Test;
import base.BaseClass;

public class ContinueToHomePageTest extends BaseClass{

	@Test
	public void continueToHomePageTest() {
		homePage.homePageSteps();
		//continueToHomePage.continueToHomeSteps(continueToHomePage);
	}
}
