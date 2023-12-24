package MultiThreading;

public class User2 {
	public static void main(String[] args) {
		Java j=new Java();
		
		Thread t1=new Thread(j,"shankar");
		t1.start();
		
		Thread t2=new Thread(j,"shan");
		t2.start();
		t1.setName("abc");
		t2.setName("xyz");
		System.out.println("done..");
	}
}
