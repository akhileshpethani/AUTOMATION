package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driverConnection.DriverConnection;

public class DataDriven {
	
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = DriverConnection.getDriver("https://www.facebook.com/");
	}

	@Test(dataProvider = "dp")
	public void logintest(String email, String pass) throws InterruptedException {
		System.out.println(email + " : " + pass);
		WebElement username = driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(email);
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
		Thread.sleep(3000);
	}

	@DataProvider(name = "dp")
	public static Object[][] data() {
		ExcellReader ex = new ExcellReader("C:\\Users\\jagruti\\Desktop\\Water management.xlsx", "Test");
		int row = ex.rowCount();
		int col = ex.colCount();

		Object obj[][] = new Object[row - 1][col];

		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				String data = ex.getData(i, j);
				obj[i - 1][j] = data;
			}
		}
		return obj;
	}

}
