package first;
import java.util.*;
enum day {
	MONDAY("monday"),TUESDAY("tuesday"), WEDNESDAY("wednesday"), THURSDAY("monday"), 
	FRIDAY("friday"), SATURDAY("saturday"), SUNDAY("sunday");
	String textValue;
	day(){}
	day(String value)
	{
		textValue = value;
	}
	public static boolean checkString(String value) 
	{
		//values returns an array of all the enums
		for (day days : values()) 
		{
			if (days.textValue.equals(value)) {return true;}
			
		}
		return false;
	}
}
public class Enum 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a weekday: ");
		String s = keyboard.nextLine();
		System.out.println(day.checkString(s));
	}
}
