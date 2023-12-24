package objectClass;

public class BookShop {

	public static void main(String[] args) {
		Book b=new Book("lifeStory","shanker",1200,"shankar stationary");
		Book b1=new Book("noteBook","vignesh",1234,"vignesh stationary");
		Book b2=new Book("lifeStory","shanker",1200,"shankar stationary");
		Book b3=b1;
		System.out.println(b.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println("===========");
		System.out.println(b.equals(b1));
		System.out.println(b.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(b3.equals(b1));
		System.out.println("===========");
		System.out.println(b1.hashCode()==b.hashCode());
		System.out.println(b.hashCode()==b2.hashCode());
		System.out.println(b2.hashCode()==b3.hashCode());
		System.out.println(b3.hashCode()==b1.hashCode());		
	}

}
