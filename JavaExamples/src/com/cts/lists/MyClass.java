package com.cts.lists;

import java.util.ArrayList;

public class MyClass {
	
	public static void main(String[] args)
	{
		ArrayList<String> cars = new ArrayList<String>();
	    
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("mercedeez");
	    cars.get(0);
	    cars.clear();
	    System.out.println(cars);
	}
}
