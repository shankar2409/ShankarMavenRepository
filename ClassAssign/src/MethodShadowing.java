public class MethodShadowing {
	int a=10;
	static int b=20;
	public static void m() {
		System.out.println("static method from Parent  :>>>>>>>");
	}
	public void add()
	{
		System.out.println("it is a non static method  >>from parent");
	}	
}
class C2 extends MethodShadowing
{
	int a=30;
	static int b=30;
	public static void m1()
	{
		System.out.println("static method from child class");
	}
	public void add()
	{
		System.out.println("it is a non-Static method from child");
	}
}
class User2 
{
	public static void main(String[] args) {
		MethodShadowing ref1=new MethodShadowing();
		System.out.println(ref1.a);
		C2 ref2=new C2();
		System.out.println(ref2.a);
		System.out.println(C2.b);
		MethodShadowing ref3=new C2();
		ref3.add();
		C2 ref4=(C2)ref3;
		ref4.m1();
		C2 ref5=(C2)ref1;
	}
	
}