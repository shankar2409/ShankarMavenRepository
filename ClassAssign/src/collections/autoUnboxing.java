package collections;

public class autoUnboxing {
	public static void main(String[] args) {
		Integer i=new Integer(5);
		
		Integer i1=5;
		Boolean b=true;
		
		//before 1.5v
		
		int a=i1.intValue();
		System.out.println(i.toString());
		System.out.println(a);
		
		
		boolean b1=b.booleanValue();
		System.out.println(b.toString());
		System.out.println(b1);
		
		
		
		//after 1.5v
		
		int w=i1;
		boolean y=b;
		
		System.out.println(w);
		System.out.println(y);
		
	}
}
