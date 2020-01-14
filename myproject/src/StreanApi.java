import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreanApi {
	
	public static void main(String[] args)
	{
		
		List<Employee> employees=new ArrayList<Employee>();
		addEmployees(employees);
		
		List<String> idscale=employees.stream().map(emp->emp.getAddress().toUpperCase()).collect(Collectors.toList());
	     System.out.println("print the employeeid");
		idscale.forEach(System.out::println);
		
		List<Double> increaseSalary=employees.stream().map(emp->emp.getSalary()*1.1).collect(Collectors.toList());
		increaseSalary.forEach(System.out::println);
		
		
	}
		//List<String> names=new ArrayList<String>();
		//addName(names);
		
		//names.forEach(System.out::println);
		//List<String> lengthScale=names.stream().filter(s-> s.length() >=7).collect(Collectors.toList());
		//System.out.println("the names which has length greater than 7:\n");
		//lengthScale.forEach(System.out::println);
		
		//print all names in capital letters//
		//List<String> capNames=names.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		//System.out.println("print the names in uppercase");
		//capNames.forEach(System.out::println);
		
		
		
		//}

//	private static void addName(List<String> names) {
	//	names.add("yasmin");
		//names.add("younus");
		//names.add("azu");
		//names.add("mohammad ismail");
		
	

private  static void addEmployees(List<Employee> employee)
{
Employee emp1=new Employee(122,"akhil","hyd", 9000,10000);
Employee emp2=new Employee(123,"syed","hyd", 8990,20000);
employee.add(emp1);
employee.add(emp2);




}
}