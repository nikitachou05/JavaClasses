package first;

public class MultiCatchException 
{
	public static void main(String[] args) 
	{
		//checked exceptions ==> those exceptions that must be handled (anything outside java)
		//unchecked exceptions ==> those exceptions that doesn't need to be handled (anything inside java)
		int a = 10, b = 0;
		int[] int_array = {1, 2, 3};
		try 
		{
			//int result = a/b;
			System.out.println("2nd exception caught");
			int_array[4] = 4;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException error) 
		{
			System.out.println("exception caught");
		}
	}
}
