package first;

public class LambdaExpressionExceptions 
{
	public static void main(String[] args) 
	{
		double[] double_array = {0.5, 0.9, 0.1, 2.1, 3.9};
		double[] double_array2 = {};
		DoubleNumericArrayFunction doubleNumericArrayFunction;
		doubleNumericArrayFunction = (array) -> 
		{
			int count = array.length;
			double sum = 0.0;
			if (count == 0) {
				throw new EmptyArrayException();
			}
			else {
				for (int i = 0;i<array.length;i++) 
				{
					sum = sum + array[i];
				}
				double average = sum/count;
				return average;
			}
		};
		try {
			System.out.println(doubleNumericArrayFunction.func(double_array));
			System.out.println(doubleNumericArrayFunction.func(double_array2));
		}
		catch(EmptyArrayException error) 
		{
			error.printStackTrace();
		}
	}
}
interface DoubleNumericArrayFunction
{
	double func(double[] double_array) throws EmptyArrayException;
}
class EmptyArrayException extends Exception
{
	public EmptyArrayException()
	{
		super("empty array");
	}
}