class Student{
	String sname;
	int sid;
	Student(String sname,int sid)
	{
		super();
		this.sname=sname;
		this.sid=sid;
		
	}
}
public class EqualsWithOverride {

	public static void main(String[] args) {
			Student s1=new Student("smith",1);
			Student s2=new Student("miller",3);
			Student s3=s2;
			Student s4=new Student("smith",1);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3==s2);
			System.out.println(s4==s1);
			
	}

}
