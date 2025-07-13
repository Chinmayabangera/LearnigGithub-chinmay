package OpenHRMTestClasses;


import java.io.IOException;

import org.testng.annotations.Test;

import com.Utility.PropertiesUtility;

import OpenHRMPagesClasses.LoginPageClass;

public class LoginTestClass extends BaseTestClass {

	@Test(priority=1)
	public void loginWithValidUserNameAndValidPassword() throws IOException {

		LoginPageClass loginPage = new LoginPageClass();

		loginPage.loginToApplication(PropertiesUtility.getData("username"),PropertiesUtility.getData("password"));
	}

}
