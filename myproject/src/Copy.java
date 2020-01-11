/*
 *  Write a program in C to copy the elements of one array into another array.
 */
import java.util.*;
import java.util.Scanner;

public class Copy {
	public static void main(String[] arg)
	{
		int a[],i,n,b[];
		Scanner s=new Scanner(System.in);
	      n=s.nextInt();
	      a=new int[n];
	      b=new int [n];
	      for(i=0;i<n;i++)
	      {
	    	  a[i]=s.nextInt();
	    	  System.out.println("elements in an array"+a[i]);
	    	  }
	         
	    for(i=0;i<n;i++)
	    {
	    	b[i]=a[i];
	    	System.out.println("elements in an array"+b[i]);
	    	
	    }
	}

}
