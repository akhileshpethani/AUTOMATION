package Listener;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
		assertFalse(true);
	}
}
