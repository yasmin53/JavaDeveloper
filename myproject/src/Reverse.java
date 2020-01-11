/*
 * Write a program in C to read n number of values in an array and display it in reverse order
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
 */
import java.util.*;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int i,size,a[];
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		a=new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			System.out.println("order is:"+a[i]);
		}
		for(i=size-1;i>=0;i--)
		{
		System.out.println("REVERSE ORDER"+a[i]);	
		}
			
			
		}
	}
