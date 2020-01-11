/*
 * . Write a program in C to separate odd and even integers in separate arrays
 */
import java.util.*;
import java.util.Scanner;

public class Even {
	public static void main(String[] args)
	{
		int l,a[],n,i;
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
		if(a[i]%2==0) {
			System.out.println("element is even"+a[i]);
			
		}
		else
			System.out.println("element is odd"+a[i]);
	}
}

}