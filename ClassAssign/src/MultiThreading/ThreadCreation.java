package MultiThreading;
import java.lang.Thread;
public class ThreadCreation  extends Thread{
	String s;
	public ThreadCreation() {
	}
	public ThreadCreation(String s) {
		this.s=s;
	}
	@Override
	public void run()
	{
		System.out.println("thread class excuting.."+s);
	}
	public static void main(String[] args) {
		ThreadCreation ref=new ThreadCreation();
		ThreadCreation ref1=new ThreadCreation("shankar");
		ref.start();
		ref1.start();
		 Thread res=Thread.currentThread();
		 System.out.println(res);
		 ref.setName("Threadname :shankar");
		 System.out.println(ref.getName());
		 System.out.println(ref.getPriority());
		 System.out.println(ref.getId());
	}
}
