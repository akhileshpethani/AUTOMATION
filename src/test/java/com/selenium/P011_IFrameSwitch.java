package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P011_IFrameSwitch {
	public static void main(String[] args) {
		String url = "https://demoqa.com/frames";
		
		WebDriver driver = DriverConnection.getDriver(url);
		
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		
		driver.switchTo().window(driver.getWindowHandle());
		
		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		
		WebElement heading2 = driver.findElement(By.id("sampleHeading"));
		System.out.println(heading2.getText());
		

	}
	
}
