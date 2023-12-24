package ObjectOveride;

public class Student {
	String sname;
	int sid;
	Student(String sname,int sid)
	{
		super();
		this.sname=sname;
		this.sid=sid;
	}
	@Override
	public boolean equals(Object o)
	{
		//downcasting
		Student s=(Student)o;
		return (this.sid==s.sid&&this.sname.equals(s.sname));
	}
}
