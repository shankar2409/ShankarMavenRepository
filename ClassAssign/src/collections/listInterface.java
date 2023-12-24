package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class listInterface {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList s=new LinkedList();
		System.out.println("enter the student details  :");
		boolean b=true;
		while(b)
		{
			s.add(sc.next());
			System.out.println("continue...Y/N");
			char c=sc.next().charAt(0);
			if(c=='n'||c=='N')
			{
				b=false;
			}
		}
		
		System.out.println("enter the character in search ih the students");
		char c1=sc.next().charAt(0);
		char c2=(char)((c1>='a'&&c1<='z')?c1-32:c1);
		System.out.println(c2);
		Iterator itr=s.iterator();
		int i=0;
		while(itr.hasNext())
		{
			System.out.println("====");
			if(i>=0&&i<=s.size()-1)
			{
				String student=(String)s.get(i);
				
				System.out.println(student);
				if(student.toUpperCase().charAt(0)==c2)
				{
					System.out.println(student);
				}
				i++;
				itr.next();
			
			}
		}
 	}
}
