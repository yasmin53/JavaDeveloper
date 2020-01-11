package com.cts.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
}
public class CalculatorTest{
	
	static Calculator calculator;
	
	//@Before
	@BeforeClass
	public static void init() {
	calculator = new Calculator();
		System.out.println("calculator Object created");
		}
	
	@AfterClass
	public static void destroy()
	{
		System.out.println("calculator object destroy");
	}
	

}

