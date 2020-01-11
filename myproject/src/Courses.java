import java.util.Scanner;
public class Courses {
	public static void main(String[] args)
	{
		
		
		Scanner s=new Scanner(System.in);
		String courses=s.nextLine();
		System.out.println("1.java      5000");
		System.out.println("2.c         3000");
		System.out.println("3.c++       2000");
		System.out.println("4.python      10000");
		System.out.println("5.angular     20000");
	
		
		int price=0;
		if(courses.contains("java"))
		{
		price=price+5000;
		}
		if(courses.contains("c"))
		{
		price=price+3000;
		}
		
		if(courses.contains("c++"))
		{
		price=price+2000;
		}
		if(courses.contains("python"))
		{
		price=price+10000;
		}
		if(courses.contains("angular"))
		{
		price=price+20000;
		}
		
		System.out.println("finalprice"+price);
		}
		
		}
	

