import java.lang.*;
class Laptop extends Object{
	String brand;
	double price;
	Laptop()
	{}
	public Laptop(String brand,double price) {
		super();
		this.brand = brand;
		this.price=price;
	}
	@Override
	public String toString() {
		return "brand :"+brand+"  price :"+price;
	}
	
}
public class OverrideToObjectMethod {

	public static void main(String[] args) {
		Laptop l1=new Laptop("Hp",45000);
		Laptop l2=new Laptop("Dell",40000);
		Laptop l3=new Laptop("Lenove",25000);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}

}
