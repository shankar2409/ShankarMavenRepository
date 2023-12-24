package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read_the_data_from_the_file {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			FileInputStream fin=new FileInputStream("E://java//myOutput.txt");
			try {
				int data=fin.read();
				while(data!=-1)
				{
					System.out.print((char)data);
					data=fin.read();
				}
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("done...");
	}
}
