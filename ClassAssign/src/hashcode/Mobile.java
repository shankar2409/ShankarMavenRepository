package hashcode;

public class Mobile {
	String brand;
	int ram;
	String color;
	double price;
	Mobile()
	{}
	public Mobile(String brand, int ram, String color, double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.color = color;
		this.price = price;
	}
	@Override
	public boolean equals(Object o)
	{
		Mobile m=(Mobile)o;
		return (this.brand.equals(m.brand)&&this.ram==m.ram&&
				this.color.equals(m.color)&&this.price==(m.price));

	}
}
