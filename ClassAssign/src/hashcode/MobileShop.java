package hashcode;

public class MobileShop {

	public static void main(String[] args) {
		Mobile m1=new Mobile("karbonn",8,"red",2000);
		Mobile m2=new Mobile("lava",2,"black",1200);
		Mobile m3=m2;
		Mobile m4=new Mobile("karbonn",8,"red",2000);
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m3));
		System.out.println(m1.equals(m4));
		System.out.println("================");
		System.out.println(m1.hashCode()==m2.hashCode());
		System.out.println(m2.hashCode()==m3.hashCode());
		System.out.println(m1.hashCode()==m4.hashCode());
		
	}

}
