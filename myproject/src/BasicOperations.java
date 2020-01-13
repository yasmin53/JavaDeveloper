import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class BasicOperations {

	public static void main(String[] args) throws IOException
	{
		FileSystem fs=FileSystems.getDefault();
		
		Path path=fs.getPath("c:/users/Lenovo/Desktop/dailywork/data2.txt");
		System.out.println("name count:"+path.getNameCount());
		System.out.println("is absolute:"+path.isAbsolute());
		System.out.println("name on index 2:"+path.getName(2));
		
		
		Files.createFile(path);
	//	Files.createDirectory(path);
		
		
		//Files.delete(path);

		
		
		
		
		
		
	}
}
