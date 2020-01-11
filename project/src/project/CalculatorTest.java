package project;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal;
	@Before
	public void init()
	{
		cal=new Calculator();
		System.out.println("calculator object created");
		}
	
	@After
	public void destroy()
	{
		cal=null;
		System.out.println("calculator object destroyed");
	}
	

	@Test
	public void test() {
		assertEquals(5,cal.add(2, 3));
		
	}

}
