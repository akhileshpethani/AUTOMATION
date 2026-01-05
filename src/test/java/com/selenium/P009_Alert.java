package com.selenium;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverConnection.DriverConnection;

public class P009_Alert {
	
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		
		WebDriver driver =DriverConnection.getDriver(url);
		
//		1.
//		WebElement btn1 = driver.findElement(By.id("alertButton"));
//		btn1.click();
//		Alert alert1= driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert1.accept();
		
//		2.
//		WebElement btn1 = driver.findElement(By.id("timerAlertButton"));
//		btn1.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert1= driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert1.accept();
		
//		3.
//		WebElement btn1 = driver.findElement(By.id("confirmButton"));
//		btn1.click();
//		Alert alert1 = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert1.dismiss();
		
//		4.
		WebElement btn1 = driver.findElement(By.id("promtButton"));
		btn1.click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.sendKeys("hello");
		alert1.accept();
	}
	

}
