package secondproject;

public class Overridding {
	
	public static void main(String[] args)
	{
		
	Employee1 employee= new Employee1();
	employee.display();
	Manager1 manager=new Manager1();
	manager.display();
	}
}
class Employee1
{
	public void display()
	{
		System.out.println("employee class");
			}
}
class Manager1 extends Employee1
{
	public void display()
	{
		System.out.println("manager class");
	}


}
