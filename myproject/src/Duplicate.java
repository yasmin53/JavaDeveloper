/*
 * 4. Write a program in C to count a total number of duplicate elements in an array
 */
import java.util.*;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args)
	{
		int a[],i,j,count=0,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			System.out.println("elements in array:"+a[i]);
			}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
		
				if(a[i]==a[j])
					count++;
				
				else
					break;
					
			}
		}
	System.out.println("duplicate"+count);
	}

}
