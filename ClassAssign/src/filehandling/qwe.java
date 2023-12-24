package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class qwe {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the fine name");
		String fn=s.next();
		File folder=new File("E://buddy//"+fn);
		
		FileOutputStream fout=new FileOutputStream(folder,true);
		
		System.out.println("done...");
	}
}
