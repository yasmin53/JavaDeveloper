import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee emp1=new Employee(1,"yasmin", "AndhraPradesh",78758);
		Employee emp2=new Employee(2,"akhil", "Hyderabad",7545);
		Employee emp3=new Employee(3,"Syed", "Hyderabad",7878758);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		for (Employee e:list)
		{
			System.out.println(e);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
