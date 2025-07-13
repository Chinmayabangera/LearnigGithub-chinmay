package OpenHRMPagesClasses;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.report.ExtentReportUtils;

import OpenHRMTestClasses.BaseTestClass;

public class HomePageClass {
	@FindBy(linkText= "Admin")
	WebElement adminlink;

	WebDriver driver;

	@FindBy(linkText = "Logout")
	WebElement logoutLink;
	
	 @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
	WebElement profilePicture;
	 
	public HomePageClass() {
		PageFactory.initElements(BaseTestClass.driver, this);
		this.driver = OpenHRMTestClasses.BaseTestClass.driver;
		
	}

	   
	Logger log = LogManager.getLogger(HomePageClass.class);
	    public void logoutFromApplication() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

	       //  Wait for visibility and then use the WebElement directly
	       wait.until(ExpectedConditions.visibilityOf(profilePicture));
	        profilePicture.click();
	        log.info("profile Picture button is clicked.");
	        ExtentReportUtils.addStep("Profile Picture is clicked");
			

	      wait.until(ExpectedConditions.visibilityOf(logoutLink));
	      logoutLink.click();
	      log.info("Logout link is cliked.");log.info("Logout link is cliked.");
	      ExtentReportUtils.addStep("Logout is completed");
			
	       
	    }

	

}
