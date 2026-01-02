package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;

public class P006_webtable {
	public static void main(String[] args) {
		String url = "https://demoqa.com/webtables";
		
		WebDriver driver = DriverConnection.getDriver(url);
		
//		WebElement text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[2]"));
//		System.out.println(text.getText());
		
//		WebElement text2 = driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']/div[1]/div[1]/div[1]/div[1]/div[@class='rt-resizable-header-content']"));
//		System.out.println(text2.getText());
		
//		WebElement text3 = driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']/div[1]/div[1]/div[1]/div[1]/div[1]"));
//		System.out.println(text3.getText());
		
		WebElement text4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[4]"));
		System.out.println(text4.getText());
	}

}
