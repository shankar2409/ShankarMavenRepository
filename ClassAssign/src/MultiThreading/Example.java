package MultiThreading;

public class Example {
	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		
		long id=Thread.currentThread().getId();
		
		int priority=Thread.currentThread().getPriority();
		
		System.out.println(name+" name");
		System.out.println(id+"  id");
		System.out.println(priority+"  priority");
		
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("java");
		
		priority=Thread.currentThread().getPriority();
		System.out.println(priority+" priority");
		System.out.println(name+" name");
		
	}
}
