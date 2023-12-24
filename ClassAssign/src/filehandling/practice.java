package filehandling;

import java.io.File;
import java.io.IOException;

public class practice {
	public static void main(String[] args) {
		File folder=new File("E://qwerty//pptfile.exe");
		if(folder.mkdir())
		{
			System.out.println("folder is created..");
		}
		else {
			System.out.println("folder already exists..");
		}
		File f1=new File("E://qwerty//pptfile2.pptx");
		try {
			if(f1.createNewFile())
			{
				System.out.println("file is created");
			}
			else {
				System.out.println("file is already exists");
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
