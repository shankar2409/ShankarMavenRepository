

public class Exccception {
	static String[] s;
	public static void main(String[] args) {
		System.out.println("excution starts");
		
		try {
			System.out.println("=====");
		s=new String[3];
		s[10]="shankar";
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
		}
		catch(RuntimeException e)
		{
			System.out.println(e.toString());
		}
		
	System.out.println("=================");
		String str="shankar";
		try {
		System.out.println(str.charAt(11));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		
	}

}
