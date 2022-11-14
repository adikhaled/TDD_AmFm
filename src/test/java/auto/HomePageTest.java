package auto;

import org.testng.annotations.Test;
import base.BaseClass;

public class HomePageTest extends BaseClass{
	
	@Test
	public void autoTest() {
	homePage.homePageSteps();
	}

}
