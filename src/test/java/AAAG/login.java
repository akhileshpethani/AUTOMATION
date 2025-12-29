package AAAG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class login {
	public static void main(String[] args) {
		
		String url = ("https://deverp.aaagindia.com");
		 
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement email = driver.findElement(By.id("login_email"));
		email.sendKeys("janak@pseudcoocode.co");
		
		WebElement password = driver.findElement(By.id("login_password"));
		password.sendKeys("Admin@123");
		
//		WebElement loginbtn = driver.findElement(By.className("btn btn-sm btn-primary btn-block btn-login"));
//		loginbtn.click();
		
	}
	
}
