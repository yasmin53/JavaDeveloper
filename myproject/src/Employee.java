import java.io.Serializable;


public class Employee implements Serializable {
	
	
	
	private static final double Salary = 0;
	private int id;
	private String name;
    transient private String address;//make them no serialiazable//
	private double phone;
	private double salary;
	
	public Employee(int id, String name, String address, double phone,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.salary=salary;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhone() {
		return phone;
		
	}
	public double getSalary()
	{
		return salary;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", salary="+salary+" ]";
	}


	

}

