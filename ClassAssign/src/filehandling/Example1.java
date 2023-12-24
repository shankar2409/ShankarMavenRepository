package filehandling;
 import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Example1 {
	public static void main(String[] args) {
		File folder=new File("E//HiEveryone");
	try {
		String[] s=folder.list();
		for (String string : s) {
			System.out.println(string);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	File f=new File("E://HiEveryone//");
	try {
		if(f.createNewFile())
		{
			System.out.println("file is created..");
			
		}
		else {
			System.out.println("file is already exists..");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	System.out.println(f.exists());
	System.out.println(f.getName());
	System.out.println(f.getAbsolutePath());
	System.out.println(f.length());
	
	
	}
}
