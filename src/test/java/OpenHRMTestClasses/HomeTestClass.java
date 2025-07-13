package OpenHRMTestClasses;


import org.testng.annotations.Test;

import OpenHRMPagesClasses.HomePageClass;

public class HomeTestClass extends BaseTestClass{
	

	@Test(priority =2)
	public void logout() {
		HomePageClass homePage = new HomePageClass();
		
		homePage.logoutFromApplication();
	}

	
}
