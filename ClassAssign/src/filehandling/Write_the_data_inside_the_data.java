package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Write_the_data_inside_the_data {
	public static void main(String[] args) {
		File f1=new File("E://java//calculator.txt");
		Scanner s=new Scanner(System.in);
		try {
			FileOutputStream fout=new FileOutputStream(f1,true);
			try {
				System.out.println("enter the data ");
				int a=s.nextInt(),b=s.nextInt();
				String s1="the sum of "+a+" * "+b+" = "+(a*b);
				byte[] c=s1.getBytes();
				fout.write(c);
				fout.write('\n');
				fout.flush();
				fout.close();
				System.out.println("done...");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
