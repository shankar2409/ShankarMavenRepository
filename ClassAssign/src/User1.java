class P{
	int i=1;
	static int a=5;
}
class C extends P
{
	int i=4;
	int b=20;
	static int a=10;
}
class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P ref=new P();
		System.out.println(ref.i);//1
		System.out.println(ref.a);//5
		P ref1=new C();
		//System.out.println(ref1.b);
		System.out.println(ref1.i);//1
		System.out.println(ref1.a);//5
		C ref3=(C)ref1;
		System.out.println(ref3.i);//4
		System.out.println(ref3.a);//10
		
	}

}
