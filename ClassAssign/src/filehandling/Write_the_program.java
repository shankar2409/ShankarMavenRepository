package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Write_the_program {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		File folder=new File("E://buddy//myFile.txt");
		
		try {
			FileOutputStream fout=new FileOutputStream(folder,true);
			try {
				System.out.println("enter the data");
				for(int i=0;i<=3;i++)
				{
					
					fout.write(s.nextInt());
				}
			
				System.out.println("done..");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		
		
	}
}
