package MultiThreading;

public class User1 {
	public static void main(String[] args) {
		Java j=new Java();
		
		Thread t1=new Thread(j);
		Thread t2=new Thread(j);
		System.out.println(t1.isAlive());//false
		t1.start();
		t2.start();
		t1.setName("xyz");
		t2.setName("abc");
		System.out.println(t2.isAlive());//true
		System.out.println(t1.isAlive());//true 
	}
}
