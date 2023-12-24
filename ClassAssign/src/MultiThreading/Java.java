package MultiThreading;

public class Java implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"is executing");
	}
}
