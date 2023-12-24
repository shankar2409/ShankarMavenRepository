import java.util.Objects;

interface A{
	static final int a=202;
	int b=10;
	int c=30;

	public abstract void mul(int a,int b,int c);
	public static void add(int w,int b,char c)
	{
	//	a=33000; final variables will not be reinitialized
		System.out.println(w+b+c);
	}
	public  void sub(int a,int b,short d) ;	
}
 class qwertt implements A
 {
	 int f=44;
	 int g=334;
	 @Override
	public void mul(int a, int b, int c) {
		System.out.println(a*b*b*c);
	}
	 @Override
	public  void sub(int w,int b,short c) {
		 System.out.println("hiii everyone");
	 } 
 }
class B implements A{
	  int c;
	  int b;
	B(int b,int c)
	{
		//load all non static
		this.b=b;
		this.c=c;
	}
	static
	{
		System.out.println("object execution");
	}
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	 public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	@Override
	public void mul(int a, int b, int c) {
		System.out.println(a*b*c);
	}
	@Override
	public void sub(int a, int b, short d) {
		System.out.println(a-b-d);
	}
}
public class PolyMorhism  extends B{
	PolyMorhism(int b, int c) {
		super(b, c);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("excution starts");
		B ref=new B(20,30);
		A.add(220, 11,'b');
		ref.mul(2, 1, 4);	
		System.out.println(ref.b);
		System.out.println(B.a);
		System.out.println(ref.a);
		
	}
}
 class add{
	 private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		add other = (add) obj;
		return a == other.a && b == other.b;
	}
	int b;
	public add(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
}
