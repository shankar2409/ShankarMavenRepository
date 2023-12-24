package collections;

public class example {
	public static void main(String[] args) {
		int a=10;
		
		Integer i1=Integer.valueOf(a);
		Integer i2=Integer.valueOf(a);
				
		Integer r1=a;
		Integer r2=a;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1==r2);//beacause toString overridden 
		//r1.toString()==r2.toString();
	}
}
