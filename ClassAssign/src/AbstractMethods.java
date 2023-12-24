import java.util.Objects;

abstract class Mobile{
	int a=10;
	static int  b=20;
	int ram;
	String brand;
	private String model;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	String rom;
	String price;
	Mobile()
	{}
	public Mobile(int ram, String brand, String model, String rom, String price) {
		super();
		this.ram = ram;
		this.brand = brand;
		this.model = model;
		this.rom = rom;
		this.price = price;
	}
	abstract public void m1(int amount);
}
class MobileUser extends Mobile{
	int a=19999;
	static int b=5000;
	String shopName;
	int startedDate;
	String ownerName;
	MobileUser()
	{
		
	}
	
	MobileUser(String shopName, int startedDate, String ownerName) {
		this.shopName = shopName;
		this.startedDate = startedDate;
		this.ownerName = ownerName;
	}
	@Override
	public void m1(int amount)
	{
		if(amount>5000&&amount <20000) {
			System.out.println("you can buy new mobile");	
		}
		else if(amount>20000){
			System.out.println("you can buy iphone ");
		}
		else {
			System.out.println("you can go for the loan ");
		}
	}
	@Override
	public String toString()
	{
		return "shopName "+shopName+ " startedDate "+shopName+" ownerName "+ownerName;
	}
	@Override
	public boolean equals(Object o)
	{	
		MobileUser ref=(MobileUser)o;
		return this.shopName.equals(ref.ownerName)&&this.startedDate==ref.startedDate&&
				this.ownerName.equals(ref.ownerName);
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(shopName,startedDate,ownerName);
	}
	
	
}
public class AbstractMethods {

	public static void main(String[] args) {
		MobileUser ref=new MobileUser("360 mobile shop",1998,"shankar");
		ref.m1(20000);
		Mobile ref1=new MobileUser("240 mobile shop",2000,"shankar");
		System.out.println(ref.getModel());
		ref.brand="oppo";
		ref.setModel("chp2001");
		System.out.println("brand :"+ref.brand +"  model :"+ref.getModel());
		System.out.println("==============");
		System.out.println(ref.hashCode()==ref1.hashCode());
		System.out.println(ref.toString());
		System.out.println(ref.equals(ref1));
		System.out.println(ref.a);
		System.out.println(Mobile.b);
		System.out.println(ref.b);

//		Mobile ref2=new Mobile(16, "oppo","cph 2001",128,//
		//because of the Mobile class is abstract class
		//so that we cannot create the Object for the mobile class
		String s="shankar is doing programming in laptop at 10 pm";
		String s1="shankar is doing programming in laptop at 11 pm";
		System.out.println(s.equalsIgnoreCase(s1));
		
	}

}
