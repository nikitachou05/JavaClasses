package first;
//create an exception by implementing the Runnable Interface
public class CreateThread
{
	public static void main(String[] args) 
	{
		NewThread nt = new NewThread();
		//calling a method in the thread variable in the NewThread Class
		//start method starts the execution for the NewThread object??
		nt.t.start();
		try 
		{
			for(int i = 5;i>=0;i--) 
			{
				System.out.println("main thread: "+i);
				//pause execution for 1s (1000 ms) and then resume it
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException error) 
		{
			//can be interruputed by user or computer process
			System.out.println("main thread interrupted");
		}
		System.out.println("exiting main thread");
	}
}
class NewThread implements Runnable
{
	String thread_name;
	Thread t;
	public NewThread() 
	{
		t = new Thread(this, "demo");
	}
	public NewThread(String thread_name) 
	{
		this.thread_name = thread_name;
		t = new Thread(this, thread_name);
	}
	@Override
	//run (like main) is the entry point
	public void run() 
	{
		// TODO Auto-generated method stub
		try 
		{
			for(int i = 5;i>=0;i--) 
			{
				System.out.println(thread_name+" executing "+i);
				//pause execution for 1s (1000 ms) and then resume it
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException error) 
		{
			//can be interruputed by user or computer process
			System.out.println("child thread interrupted");
		}
		System.out.println("exiting child thread");
	}
}