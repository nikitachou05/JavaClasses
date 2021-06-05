package first;

public class LearnThread 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("current thread: "+t);
		//changing name of thread
		t.setName("thread");
		System.out.println("after name change: "+t);
		//try catch
		try 
		{
			for(int i = 5;i>=0;i--) 
			{
				System.out.println(i);
				//pause execution for 1s (1000 ms) and then resume it
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException error) 
		{
			//can be interruputed by user or computer process
			System.out.println("main thread interrupted");
		}
	}
}
