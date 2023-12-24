package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Vector1GenericCollection {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80};
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		
		for (int i = a.length-1;i>=0 ; i--) {
			b.add(a[i]);
		}
		
		System.out.println(b);
		
		
		
	}
}
