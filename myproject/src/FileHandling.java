import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
		public static void main(String[] args) throws FileNotFoundException,IOException
		
		{
			
			String path="c:\\users\\Lenovo\\Desktop\\dailywork\\data.txt";//absolute path//
			//File file=new File(path);
			FileInputStream fin= new FileInputStream(path);
			FileOutputStream fout= new FileOutputStream("copied.txt");//relative path//
			
			
			int i;
			while ((i= fin.read())!=-1)
			{
				fout.write(i);
				//System.out.print((char)i);
				
			}
			
			fin.close();
		}
}
			
			
			
			
			
			//System.out.println("can execute ?:"+file.canExecute());
			//System.out.println("can read ?:"+file.canRead());
			//System.out.println("can write ?:"+file.canWrite());
			//System.out.println("file exists ?:"+file.exists());
			//System.out.println("absolute path ?:"+file.getAbsolutePath());
			//System.out.println("Write Data");
			
			//FileOutputStream fout=new FileOutputStream(file,true);
			//Scanner sc=new Scanner(System.in);
			//String msg=sc.nextLine();
			//String msg="welcome to filehandling";
			//byte [] b=msg.getBytes();
			//fout.write(b);
			//fout.close();
			
			
		
	

