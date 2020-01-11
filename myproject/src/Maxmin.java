/*
 *  Write a program in C to find the maximum and minimum element in an array
 */
import java.util.*;
import java.util.Scanner.*;
public class Maxmin {
public static void main(String[] args)
{
	int l,a[],n,i,q,m;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	a=new int[n];
	for(i=0;i<n;i++)
	{
	a[i]=s.nextInt();
	System.out.println("elements in array:"+a[i]);
	}
	l=a[0];
	for(i=0;i<+n;i++)
	{
		if(a[i]>l)
			l=a[i];
	}
	System.out.println("maximum :"+l);
	
	m=a[0];
	for(i=0;i<n;i++)
	{
		if(a[i]<m)
		m=a[i];
	}
	
	System.out.println("minimum :"+m);
	}
}