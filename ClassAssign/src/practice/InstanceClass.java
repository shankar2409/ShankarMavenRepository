package practice;

class A {
	private A() {
		System.out.println("hai");
	}
	public A(int a)
	{
		System.out.println(a);
	}

	private static A a=new A();

	public static A getInstance() {
//		if (a.equals(null)) {
//			a = new A();
//		}
		return a;
	}
}

public class InstanceClass {
	public static void main(String[] args) {
//		A a=new A();
		A ac=new A(3);
		System.out.println(A.getInstance());
		System.out.println(A.getInstance());
	}
}
