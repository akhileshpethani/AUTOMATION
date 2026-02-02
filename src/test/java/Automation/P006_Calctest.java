package Automation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P006_Calctest {
	@Test
	public void addtest() {
		
		Calc c = new Calc();
		int actual = c.add(10,40);
		int expected = 50;
		assertEquals(expected, actual);
		
		
	}
	
}
