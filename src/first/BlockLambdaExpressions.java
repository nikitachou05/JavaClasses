package first;

public class BlockLambdaExpressions 
{
	public static void main(String[] args) 
	{
		BlockLambdaInterface blockLambdaInterface;
		blockLambdaInterface = (n) -> 
		{
			int mult = 1;
			for(int i = n;i>0;i--) {mult = mult*i;}
			return mult;
		};
		System.out.println(blockLambdaInterface.CalculateFactorial(5));
	}
}
interface BlockLambdaInterface
{
	int CalculateFactorial(int num);
}