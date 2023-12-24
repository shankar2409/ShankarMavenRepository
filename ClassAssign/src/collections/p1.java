package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;


public class p1 {
	public static void main(String[] args)  {
		
		 ArrayList	arr=new ArrayList();
		
		arr.add("shankar");
		arr.add("123");
		arr.add("123");
		
		for(Object o:arr)
		{
			System.out.println(o);
		}
		
		LinkedList ll=new LinkedList();
		ll.addAll(arr);
		ll.add("shannnnn");
		ll.add("123");
		ll.add("754");
		System.out.println(ll);
		System.out.println(ll.retainAll(arr));
		System.out.println(ll);
		
		Vector v=new Vector();
		v.addElement("hiii");
		System.out.println(v);
		ll.addLast("asdakk");
		System.out.println("linkedlist"+ll);
		TreeSet ts=new TreeSet();
		ts.addAll(ll);
		System.out.println("treeset"+ts);
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.addAll(ts);
		lhs.add("sqwe");
		lhs.add(123);
		lhs.add('a');
		lhs.add(123);
		System.out.print(lhs);
		HashMap<String, Integer> s=new HashMap<String, Integer>();
		s.put("asdd", 1);
	
		
//		s.put("apple", 1);
		Set<String> map = s.keySet();
		System.out.println(s+"   sdfsd");
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(map);
		System.out.println("arraylist  :"+al
				);
		Hashtable<String, Integer> n=new Hashtable<String, Integer>();
		n.putAll(s);
		System.out.println(n);
		
	}


	
}
