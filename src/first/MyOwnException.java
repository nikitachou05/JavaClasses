package first;

//gives error because we have to throw error at method level not class level
public class MyOwnException
{
	//throws tell that this method throws ____ error/exception
	static void compute(int num) throws ExceptionDemo
	{
		System.out.println("called compute "+num);
		if(num>10) 
		{
			//throw keyword helps to throw exceptions
			throw new ExceptionDemo(num);
		}
	}
	public static void main(String[] args) 
	{
		try 
		{
			compute(5);
			compute(21);
		}
		catch(ExceptionDemo error) 
		{
			System.out.println("caught "+error);
		}
	}
}
class ExceptionDemo extends Exception
{
	private int detail;
	ExceptionDemo(int detail)
	{
		this.detail = detail;
	}
	public String toString() 
	{
		return "my exception "+detail;
	}
}