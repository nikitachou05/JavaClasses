package first;

//final keyword makes a variable constant
//final keyword protects class from being extended
public final class AboutFinalKeyword 
{
	//final keyword protects method of parent class from being overidden by child class
	final String vowels(String s) 
	{
		return "aeiou \nfrom superclass";
	}
}
class SubOne extends AboutFinalKeyword
{
	String vowels(String s) 
	{
		return "aeiou \nfrom subclass";
	}
}