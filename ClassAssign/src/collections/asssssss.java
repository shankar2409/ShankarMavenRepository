package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class asssssss {
	public static void main(String[] args) {
		LinkedList s=new LinkedList();
		
		s.add('a');
		s.add('b');
		s.add('c');
		s.add('d');
		s.add('e');
		s.add('f');
		s.add('l');
		
		System.out.println(s);
		
		for(int i=0;i<s.size()-3;i++)
		{
			System.out.println(s.get(i));
		}
		ListIterator list=s.listIterator(s.size());
		int count=0;
		while (list.hasPrevious()&&count!=3) {
			System.out.println(list.previous());
			count++;
		}
		
	}
}
