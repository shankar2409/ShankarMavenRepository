package objectClass;

import java.util.Objects;

public class MArker {
	String brand;
	String color;
	double price;
	MArker()
	{}
	public MArker(String brand, String color, double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "brand  :" +brand+"  color :"+color+"  price  :"+price;
}
	@Override
	public boolean equals(Object o)
	{
		MArker m=(MArker)o;
		return (this.brand.equals(m.brand)&&this.color.equals(m.color)&&(this.price==m.price));
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(brand,color,price);
	}
	
	
}
