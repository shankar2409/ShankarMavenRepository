package MultiThreading;

public class MyThread extends Thread {
	@Override
	public void run()
	{
		System.out.println("my thread is excuting ..");
		System.out.println(Thread.currentThread().getName());
	}
}
