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
			InputStream obj = new FileInputStream("/Users/nikitachoudhary/Desktop/2021 SPRING/CS 113/HW1_NikitaChoudahry/LearnJava/src/first/Enum.java");
			Scanner obj1 = new Scanner(obj);
			StringBuffer s = new StringBuffer();
			//hasNext checks if there is a next line in the text
			while (obj1.hasNext()) 
			{
				s.append(obj1.nextLine());
			}
			System.out.println(s.toString());
		}
		catch(FileNotFoundException error) 
		{
			error.printStackTrace();
		}
	}
}
