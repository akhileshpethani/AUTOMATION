package FBTestListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FBListener implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test start");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure");
		
		WebDriver driver = (WebDriver) result.getTestContext().getAttribute("mydriver");
		TakesScreenshot ss = (TakesScreenshot) driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\jagruti\\Documents\\ShareX\\Screenshots\\2026-02\\" + result.getName() + ".png");

		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
