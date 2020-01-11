/*
 *  Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources).
 */
import java.util.*;
import java.util.Scanner;
public class Hours {
	public static void main(String[] args)
	{
		int h,n,tp;
		Scanner s=new Scanner(System.in);
		h=s.nextInt();
		n=s.nextInt();
		tp=h*n;
		System.out.println(tp);
		
	}

}
