package first;

public class ThreadPriorties 
{
	public static void main(String[] args) 
	{
		NewThread nt1 = new NewThread("one");
		NewThread nt2 = new NewThread("two");
		NewThread nt3 = new NewThread("three");
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		//setting out  thread priorities
		//setPriority sets CPU time
		nt1.t.setPriority(Thread.MAX_PRIORITY);
		nt2.t.setPriority(Thread.NORM_PRIORITY);
		nt3.t.setPriority(Thread.MIN_PRIORITY);
		System.out.println("main thread exiting");
	}
}
