package com.cts.lists;

import java.util.HashMap;

public class HashMapDemo {
  
	
	public static void main(String[] args)
	{
		HashMap<String, String> CC = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    CC.put("England", "London");
	    CC.put("Germany", "Berlin");
	    CC.put("Norway", "Oslo");
	    CC.put("USA", "Washington DC");
	    System.out.println(CC);
	}
}
