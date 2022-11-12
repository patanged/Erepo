package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003Jenkin {

	WebDriver Driver;
	@Test
	public void testcase()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFile/chromedriver_win32/chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		Driver.findElement(By.id("email")).sendKeys("Dinesh patange");
		Driver.quit();		
	}
  
}
