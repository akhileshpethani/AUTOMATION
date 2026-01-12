package AAAG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverConnection.DriverConnection;



public class login {
	public static void main(String[] args) {
		
		String url = ("https://deverp.aaagindia.com");
		 
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement email = driver.findElement(By.id("login_email"));
		email.sendKeys("administrator");
		
		WebElement password = driver.findElement(By.id("login_password"));
		password.sendKeys("Admin@123");
		
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"page-login\"]/div/main/div[2]/div/section[1]/div/form/div[2]/button"));
		loginbtn.click();
		
//		WebElement salesorder = driver.findElement(By.xpath("//div[@class='codex-editor']/div[1]/div[13]/div[1]"));
//		salesorder.click();
		
//		WebElement salesorder = driver.findElement(By.xpath("//*[@id=\"editorjs\"]/div/div[1]/div[13]/div/div/div[1]"));
//		salesorder.click();
		
	    }
	
}
