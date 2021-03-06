import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
public static Object deserialize(String filename) throws IOException, ClassNotFoundException
{
	FileInputStream fin=new FileInputStream(filename);
	BufferedInputStream bin=new BufferedInputStream(fin);
	ObjectInputStream oin=new ObjectInputStream(bin);
	Object obj=oin.readObject();
	return obj;
}


	
public static Object serialize(Object obj,String filename) throws IOException{
	FileOutputStream fout=new FileOutputStream(filename);
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	ObjectOutputStream out=new ObjectOutputStream(bout);
	out.writeObject(obj);
	out.close();
	bout.close();
	fout.close();
	return out;
}
public static void main(String[] args)
{
Employee emp1=new Employee(122,"akhil","hyd", 9000,10000);
try
{

	serialize(emp1,"serial.txt");
	Employee emp2=(Employee)deserialize("serial.txt");
	System.out.println(emp2);
}
catch (ClassNotFoundException e)
{
	System.out.println("Exception:"+e.getMessage());
	
}
catch(IOException e)
{
	System.out.println("Exception:"+e.getMessage());
}

	
}
}
