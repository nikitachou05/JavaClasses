package first;

public class AboutInstanceOfKeyword 
{
	public static void main(String[] args) 
	{
		//instanceof ==> return true/false if variable belongs to a certain class
		AnotherInstance instanceOne = new AnotherInstance();
		AnotherInstanceTwo instanceTwo = new AnotherInstanceTwo();
		System.out.println(instanceOne instanceof AnotherInstance);
		System.out.println(instanceTwo instanceof AnotherInstanceTwo);
		//System.out.println(instanceTwo instanceof AnotherInstance);
	}
}
class AnotherInstance extends AboutInstanceOfKeyword
{
	
}
class AnotherInstanceTwo extends AboutInstanceOfKeyword
{
	
}