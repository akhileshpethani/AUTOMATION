package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		lastname.sendKeys("test1");
//		1.select by index
		WebElement days = driver.findElement(By.id("day"));
		Select day = new Select(days);
		day.selectByIndex(4);
		
		
//		2.select by value
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("9");
		
//		3.select by visible year
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByVisibleText("2004");
		
		WebElement gender = driver.findElement(By.name("sex"));
		gender.click();
		
//		List<WebElement> gender = driver.findElements(By.name("sex"));
//		gender.get(1).click();
		
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
