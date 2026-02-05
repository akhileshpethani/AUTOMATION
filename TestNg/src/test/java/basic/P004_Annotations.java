package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P004_Annotations {
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void Before() {
		System.out.println("Before Method ");
	}
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	@AfterMethod
	public void After() {
		System.out.println("After Method");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("AfterClass");
	}


}
