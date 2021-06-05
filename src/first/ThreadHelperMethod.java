package first;

public class ThreadHelperMethod 
{
	public static void main(String[] args) 
	{
		NewThread nt1 = new NewThread("one");
		NewThread nt2 = new NewThread("two");
		NewThread nt3 = new NewThread("three");
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		//isAlive checks whether thread is running (returns true if thread is running)
		//...returns a boolean
		System.out.println("thread one is alive: "+nt1.t.isAlive());
		System.out.println("thread two is alive: "+nt2.t.isAlive());
		System.out.println("thread three is alive: "+nt3.t.isAlive());
		//join() ==> checks if thread has finished executing
		//join method waits until the thread on which it is called terminates 
		try 
		{
			System.out.println("waiting for threads to finish");
			nt1.t.join();
			nt2.t.join();
			nt3.t.join();
		}
		catch(InterruptedException error) 
		{
			
		}
		System.out.println("thread one is alive: "+nt1.t.isAlive());
		System.out.println("thread two is alive: "+nt2.t.isAlive());
		System.out.println("thread three is alive: "+nt3.t.isAlive());
		//main thread is the thread which finishes in the last
		System.out.println("main thread exiting");
	}
}