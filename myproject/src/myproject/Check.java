
/*
 * Write a Program that accepts a number and checks whether it's positive, negative, or zero
 */
package myproject;

import java.util.Scanner;

public class Check {
	
	public static void main(String[] arg)
	{
	int  x;
	Scanner s= new Scanner(System.in);
	 x = s.nextInt();
	
	if(x>0)
	{
		System.out.println("is a positive");
	}
	else if(x<0)
		System.out.println("is a negative");
	else
System.out.println("is equal to zero");
	}
}
