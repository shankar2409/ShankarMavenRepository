package MultiThreading;

public class User {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t1=new MyThread();
		
		
		MyThread t2=new MyThread();
		
		t2.start();
		t1.setName("shankar");
		t2.setName("shan");
		
		System.out.println(t1.currentThread().getName());
		t1.start();
		
	}
}
