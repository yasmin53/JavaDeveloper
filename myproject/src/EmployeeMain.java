import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class EmployeeMain {
	public static void main(String[] args)throws ClassNotFoundException, SQLException
	
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="admin";
		
		Connection con= DriverManager.getConnection(url,username,password);
		System.out.println("connection establishment");
		
		
		
				
		
	}

}
