package secondproject;

import java.util.Scanner;
public class Employee
{
	public static void main(String[] args)
	{
		Inheritance inheritance=new Inheritance();
		inheritance.getdata();
		inheritance.display();
	}
}
	
class Inheritance
{
int id;
String name;
String company;

public void display()
{
System.out.println(id+name+company);
}

public void getdata()
{
Scanner scanner= new Scanner(System.in);
	
System.out.println("enter id");

id =Integer.parseInt(scanner.nextLine());

System.out.println("enter name");
name =scanner.nextLine();
System.out.println("enter company");
company=scanner.nextLine();
}
}

class Manager extends Employee
{
	int i;
	String team[]=new String[4];
	String department;
	
	
	public void getmanager()
	{
		System.out.println("team members are");
		Scanner s=new Scanner(System.in);
	
		for(i=0;i<3;i++)
		{
			team[i]=s.nextLine();	
			System.out.println(team[i]);
		}
		System.out.println("enter department name");
		department=s.nextLine();
		
	}
public void displaymanager()
{
	for(i=0;i<3;i++)
		System.out.println(team[i]);
	System.out.println(department);
}
}

class Developer extends Employee
{
	String projectname;
	String domainname;
	
	public void getdeveloper()
	{
		Scanner s1=new Scanner(System.in);
			
	}
	
	
	
	
	
	
}
