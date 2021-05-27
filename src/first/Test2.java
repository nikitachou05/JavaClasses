package first;

public class Test2 {
	public static void main(String[] args) 
	{
		//wrapper class ==>  object type version of primitive type
		Object integer = Integer.valueOf(27);
		//CAN'T CAST A VALUE OF A CLASS THAT ISN'T A SUBCLASS OF THE OTHER CLASS 
		//(THE OBJECT TYPE WE ARE TRYING TO CONVERT IT TO)
		String string = (String)integer;
	}
}
