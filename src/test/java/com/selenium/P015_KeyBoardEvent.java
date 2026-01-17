package com.selenium;

import java.awt.RenderingHints.Key;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverConnection.DriverConnection;

public class P015_KeyBoardEvent {
	public static void main(String[] args) {
		String url = "https://www.google.com/";
		
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement search = driver.findElement(By.className("gLFyf"));
		
		Actions action = new Actions(driver);
		
		action
		.click(search)
		.keyDown(Keys.SHIFT)
		.sendKeys("automation testing scope in")
		.keyUp(Keys.SHIFT)
		.pause(2000)
		.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.ENTER).build().perform();
	}
}
