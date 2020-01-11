import java.util.Scanner;

public class ExceptioDemo {
	public static boolean isValidUser(String name)throws InvalidUser
	{
		if(!user.equals("ADMIN"))
		{
			throw new InvalidUser();
			}
		return true;		
	}
public static void main(String[] args)
{
	try
	{
		isValidUser("admin");
	}
	catch (InvalidUser e)
}
}
