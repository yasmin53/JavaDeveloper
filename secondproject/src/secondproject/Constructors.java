package secondproject;

public class Constructors {
	
	public static void main(String[] args)
	{
		Student student=new Student();
		Student st=new Student(10);
		Teacher teacher=new Teacher();
		
	}

}

class Student
{
	 Student()
	{
		 super();
		System.out.println("studies");
	}
Student(int a)
{
	this();
	System.out.println("plays");
}
{
System.out.println("enjoys");

}
}
class Teacher extends Student
{
	 Teacher()
	{
		super(10);
		System.out.println("dances");
	}
	 {
		 System.out.println("sings");
	 }
}