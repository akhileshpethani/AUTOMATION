package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P010_Windowhandle {
	
	public static void main(String[] args) {
		
		String url = "https://demo.guru99.com/popup.php";
		
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement click = driver.findElement(By.linkText("Click Here"));
		click.click();
		
		String mainwin = driver.getWindowHandle();
		System.out.println("main window : " + mainwin );
		
		Set<String> allwin = driver.getWindowHandles();
		for(String win : allwin) {
			System.out.println(win);
			if (!win.equals(mainwin)) {
				driver.switchTo().window(win);
				
				WebElement email = driver.findElement(By.name("emailid"));
				email.sendKeys("akhil@gmail.com");
				
				WebElement submitbtn = driver.findElement(By.name("btnLogin"));
				submitbtn.click();
				
				driver.close();
				
			}
			
		}
		
	
	}

}
