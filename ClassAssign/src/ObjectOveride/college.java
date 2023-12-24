package ObjectOveride;
public class college{
	public static void main(String[] args)
	{
		Student s1=new Student("smith",1);
		Student s2=new Student("miller",2);
		Student s3=s2;
		Student s4=new Student("smith",1);
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(" ================================");
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		}
}
