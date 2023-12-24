package collections;

public class String_parsing {

	public static void main(String[] args) {
		String s="123";
		String s1="abc";
		
		int t=Integer.parseInt(s);
		try{
			int t1=Integer.parseInt(s1);
		}catch (Exception e) {
			System.out.println(e.toString());
		}//numberFormatException
		
		System.out.println(t+10);
		System.out.println(s+10);
		
		String s2="True";
		String s3="!@#$%^&*";
		
		boolean b=Boolean.parseBoolean(s3);
		boolean b2=Boolean.parseBoolean(s2);
		
		System.out.println(s+10);
		System.out.println(b);
		System.out.println(b2);
//		System.out.println(b+10);
		
	}

}
