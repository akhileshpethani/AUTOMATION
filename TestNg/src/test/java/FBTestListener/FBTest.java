package FBTestListener;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class FBTest {
	
	@Test
	public void LoginTest(ITestContext context) {
		System.out.println("Login");
		
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);

		WebElement emailElement = driver.findElement(By.name("email"));
		emailElement.sendKeys("selenium@gmail.com");

		WebElement passElement = driver.findElement(By.name("pass"));
		passElement.sendKeys("selenium@123");
		
		context.setAttribute("myDriver", driver);
		assertFalse(true);
		

	}

}
