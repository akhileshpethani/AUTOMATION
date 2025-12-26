package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P003_facebookCA {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		
		WebDriver driver = DriverConnection.getDriver(url);
				
		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("selenium");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("test");
		
//		WebElement Gender = driver.findElement(By.name("sex"));
//		Gender.click();

		WebElement emailornumber = driver.findElement(By.name("reg_email__"));
		emailornumber.sendKeys("selenium@gmail.com");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("test@123");
		
		WebElement signbtn = driver.findElement(By.name("websubmit"));
		signbtn.click();
		
		
	}

}
