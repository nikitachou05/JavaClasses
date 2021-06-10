package first;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LearnReadWriteFiles 
{
	public static void main(String[] args) 
	{
		try 
		{
			//obj tries to access the file in the file system
			//reading and writing files done in two ways: character based and byte stream based classes
			//byte stream reads in bytes --> converts bytes to characters --> "machine friendly"
			//character based --> doesn't convert bytes to characters 
			InputStream obj = new FileInputStream("/Users/nikitachoudhary/Desktop/2021 SPRING/CS 113/HW1_NikitaChoudahry/LearnJava/src/first/Enum.java");
			Scanner obj1 = new Scanner(obj);
			StringBuffer s = new StringBuffer();
			//StringBuffer looks at characters in its order (in a word/line)
			//StringBuilder
			//hasNext checks if there is a next line in the text
			while (obj1.hasNext()) 
			{
				s.append(obj1.nextLine() + "\n");
			}
			System.out.println(s.toString());
		}
		catch(FileNotFoundException error) 
		{
			error.printStackTrace();
		}
	}
}
