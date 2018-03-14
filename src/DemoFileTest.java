//package com.javacodegeeks.junit;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class DemoFileTest {

	DemoFile obj = new DemoFile();
	int total = obj.sum(2,5);
	int result = 10;
	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + total + " = " + result);
		assertEquals(total, result);
	}
	
	

}
