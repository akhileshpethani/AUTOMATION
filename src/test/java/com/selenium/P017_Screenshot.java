package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverConnection.DriverConnection;

public class P017_Screenshot {
	
	public static void getScreenShot (WebDriver driver, String Path ) {
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest  = new File (Path);
		
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		String url = "https://www.browserstack.com/";
		
		WebDriver driver = DriverConnection.getDriver(url);
		
		getScreenShot(driver,"C:\\Users\\jagruti\\Documents\\ShareX\\Screenshots\\2026-01\\b.png");
		
	}
}
