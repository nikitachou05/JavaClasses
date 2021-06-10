package first;

import java.io.FileReader;
import java.io.IOException;

public class LearnCharacterBasedStream 
{
	public static void main(String[] args) 
	{
		FileReader file_reader = null;
		try 
		{
			file_reader = new FileReader("/Users/nikitachoudhary/Desktop/2021 SPRING/CS 113/HW1_NikitaChoudahry/LearnJava/src/first/Hello");
			int temp;
			while ((temp = file_reader.read()) != -1) 
			{
				System.out.print((char)temp);
			}
			file_reader.close();
		}
		catch(IOException error) 
		{
			error.printStackTrace();
		}
	}
}
