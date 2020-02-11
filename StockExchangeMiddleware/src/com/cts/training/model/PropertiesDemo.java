
package com.cts.training.model;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
public class PropertiesDemo {
	@Autowired
	public static void main(String[] args) throws IOException {
//	Properties properties = new Properties();
//	FileInputStream fin = new FileInputStream("src\\FileProperty.txt");
//	properties.load(fin);
//	 System.out.println("username :" +properties.getProperty("username"));
	
		Properties p = System.getProperties();
		Set<Map.Entry<Object, Object>> set=p.entrySet();
		for(Map.Entry<Object, Object> e:set) {
			System.out.println(e.getKey(+" :"+e.getValue()));

		}
//		Set set=p.entrySet();
//		for(Object e:set) {
//			System.out.println(e);
//		}
	}
	}


	
		
	
