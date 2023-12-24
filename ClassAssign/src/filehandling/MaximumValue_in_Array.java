package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class MaximumValue_in_Array {
	public static void main(String[] args) {
		File folder=new File("E://java//myOutput.txt");
		Scanner sc=new Scanner(System.in);
		try {
			FileOutputStream fout=new FileOutputStream(folder,true);
			System.out.print("enter the array size  : ");
			int size=sc.nextInt();
			System.out.println("enter the values for array  :");
			int[] a=new int[size];
			for (int i = 0; i < a.length; i++) {
				a[i]=sc.nextInt();
			}
			int max=a[0];
			for (int i = 1; i < a.length; i++) {
				if (a[i]>max) {
					max=a[i];
				}
			}
			String result="the maximum value of the array :"+max;
			
			byte[] m=result.getBytes();
			try {
				fout.write(m);
				fout.write('\n');
				System.out.println("donee..");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e+"Exception handled...");
		}
	
		
		
	}

}
