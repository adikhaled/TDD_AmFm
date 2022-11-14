package letsGoStarted;

import org.testng.annotations.Test;

import base.BaseClass;

public class LetsGoStartedTest extends BaseClass{

	@Test
	public void letsGoStartedTest() {
		homePage.homePageSteps();
		letsGoStarted.letsGoStartedSteps();
	}
}
