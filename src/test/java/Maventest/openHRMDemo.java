package Maventest;

import java.time.Duration;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class openHRMDemo {
	ChromeDriver driver;
	
	@Test(dependsOnMethods="MyInfo")
	public void CloseBrowser()
	{
		driver.close();
	}
	
	@Test(priority=1)
	public void LaunchChrome()
	{
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	@Test(dependsOnMethods="LaunchChrome")
	public void Login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test(dependsOnMethods="Login")
	public void MyInfo()
	{
	driver.findElement(By.linkText("My Info")).click();
	driver.findElement(By.name("firstName")).clear();
	driver.findElement(By.name("firstName")).sendKeys("Chinmaya");
	}
}

