/*
 * rogram in C to sort elements of array in ascending order
 */
import java.util.*;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args)
	{
		int n,i,a[],j,t=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
				System.out.println("elemsts in array:"+a[i]);
				
		}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}
				
		}
	}
	System.out.println("acending order");
	for(i=0;i<n;i++)

		System.out.println("sort"+a[i]);
	
	}
		
	}

