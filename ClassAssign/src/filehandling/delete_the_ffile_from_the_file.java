package filehandling;

import java.io.File;
import java.util.Scanner;

public class delete_the_ffile_from_the_file {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the file name :");
		String file=s.next();
		File f=new File("E://java//"+file+".txt");
		if(f.delete())
		{
			System.out.println("file is deleted ..");
			
		}
		else {
			System.out.println("file not exist..");
		}
	}
	

}
