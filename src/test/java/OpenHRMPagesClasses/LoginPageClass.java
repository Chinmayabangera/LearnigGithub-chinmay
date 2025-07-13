package OpenHRMPagesClasses;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.report.ExtentReportUtils;

import OpenHRMTestClasses.BaseTestClass;

public class LoginPageClass {

	// login button
		@FindBy(xpath = "//button[@type=\"submit\"]")
		WebElement loginBTn;

		// password
		@FindBy(name = "password")
		WebElement passwordTextBox;

		// username
		@FindBy(name = "username")
		WebElement userNameTextBox;

		public LoginPageClass() {
			PageFactory.initElements(BaseTestClass.driver, this);
		}
          
 Logger log =LogManager.getLogger(LoginPageClass.class);

		public void loginToApplication(String userName , String password) {
			userNameTextBox.sendKeys(userName);
			log.info("Username is entered");
			ExtentReportUtils.addStep("User Name is entered");
			
			passwordTextBox.sendKeys(password);
		log.info("Password is entered");
		ExtentReportUtils.addStep("Password is entered");
		
			loginBTn.click();
		log.info("Login button is clicked");
		ExtentReportUtils.addStep("Clicked on Login button");
		
		}


}
