package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P012_Calendar {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		
		WebDriver driver = DriverConnection.getDriver(url);
		Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("//div[contains(@class,'resp-tabs-container')]/div[1]/p/iframe"));
		driver.switchTo().frame(iframe);
		
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		
		String myYear = "2025";
		String myMonth = "September";
		String myDate = "5";
		
		WebElement currentyear = driver.findElement(By.className("ui-datepicker-year"));
		System.out.println(currentyear.getText());
		
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentyear.getText());
		System.out.println("my year "+ y1);
		System.out.println("currentyear "+ y2);
		
		while(!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if (y1 > y2) {
				
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
				
			}else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
				
			}
			
		}

		while(!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if (y1 > y2) {
				
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
				
			}else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
				
			}
			
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for (WebElement date : dates) {
			System.out.println(date.getText());
			if (date.getText().equals(myDate)) {
				date.click();
			}
		}	

	}

}
