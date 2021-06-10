package first;

//lambda expression: a method that doesn't have a name, an anonymous method
//has two parts: 1. lambda expressions 2. functional interface
//functional interface: interface having only one abstract method
// functional interface reference variable = () -> expression block
//
public class LambdaExpressions 
{
	public static void main(String[] args) 
	{
		//-> : arrow operator 
		MyNum my_num;
		//my_num has one method ==> double getValue()
		// double getValue() return 9.9
		my_num = () -> 9.9;
		System.out.println(my_num.getValue());
		EvenNum even_num;
		//functional interface reference variable = (parameters variables) -> true expression block
		//n is automatically an int
		even_num = (n) -> n%2 == 0;
		System.out.println(even_num.evenOrNot(9));
		System.out.println(even_num.evenOrNot(10));
	}
}
interface MyNum
{
	double getValue();
}
interface EvenNum
{
	boolean evenOrNot(int num);
}