package objectClass;
import java.util.*;
public class Book {
	String bname;
	String author;
	double price;
	String publisher;
	Book()
	{}
	public Book(String bname, String author, double price, String publisher) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	@Override
	public String toString()
	{
		return "bname  :"+bname+ " author  :"+author+ " price  :"+price+" publisher  :"+publisher;
	}
	@Override
	public boolean equals(Object o)
	{
		Book b=(Book)o;
		return (this.bname.equals(b.bname)&&this.author.equals(b.author)
				&&this.price==b.price&&this.publisher.equals(b.publisher));
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(bname,author,price,publisher);
	}
}
