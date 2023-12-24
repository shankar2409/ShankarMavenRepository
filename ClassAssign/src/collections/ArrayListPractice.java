package collections;


import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListPractice {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList a1=new ArrayList();
		
		
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		
		a1.add("shankar");
		a1.add(2.1);
		a1.add(true);
		a1.add('j');
		a1.add(1,'j');
		a1.add(null);
		System.out.println(a1);
		
		
		//adding with another arrayList
		
		ArrayList al1=new ArrayList();
		al1.add("java");
		al1.add("sql");
		al1.add("manual");
		al1.add("automation");
		al1.addAll(2,a1);
		System.out.println(al1);
		//al1.add(a1);
		System.out.println();
		
	
		//search the elements
		
		System.out.println(al1.contains("java"));
		System.out.println(a1.contains("manual"));
		System.out.println(al1.contains(a1));
		
		System.out.println(al1);
		System.out.println("====================");
		//removing the elements
		
		
//		al1.remove("automation");
		//al1.removeAll(a1);
//		al1.retainAll(a1);
//		System.out.println(al1);
//		System.out.println(a1);
//		
		
		//using the for each loop
		
		for(Object o:a1)
		{
			String s1=(String)o;
			if(s1.charAt(0)=='L'||s1.charAt(0)=='l')
			{
				System.out.println(s1);
			}
			
			
		}
	}
}
//package collections;
//
//public class ArrayListPractice{
//	String a;
//	public ArrayListPractice()
//	{
//		a+="hello";
//		
//	}
//	public static void main(String[] args)
//	{
//		System.out.println(new ().a);
//	}
//}