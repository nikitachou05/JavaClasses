package first;

public class Abstraction 
{
	public static void main(String[] args) 
	{
		SecondSUB s2 = new SecondSUB();
		System.out.println(s2.YourName("Nikita"));
		System.out.println(s2.YourNameReversed("Nikita"));
	}
}

abstract class FirstSUB implements Interface
{
	abstract String YourName(String name);
	String YourNameReversed(String name) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append(name);
		return sb.reverse().toString();
	}
	public double calSquareRoot(double num) 
	{
		return Math.sqrt(num);
	}
}
class SecondSUB extends FirstSUB
{
	String YourName(String name) 
	{
		return "Your Name is "+name;
	}
}