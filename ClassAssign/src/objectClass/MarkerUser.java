package objectClass;

public class MarkerUser {
	public static void main(String[] args) {
		MArker a = new MArker("brand", "black", 150);
		MArker a1 = new MArker("camel", "red", 234);
		MArker a3=a1;
		MArker a2 = new MArker("brand", "black", 150);
		System.out.println(a.toString());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a.equals(a1));
		System.out.println(a3.equals(a1));
		System.out.println(a.hashCode()==a2.hashCode());
		System.out.println(a1.hashCode()==a3.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a.hashCode());
	}
}
