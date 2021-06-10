package first;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LearnWriteFile
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("file.txt");
		if (file.createNewFile()) 
		{
			System.out.println("File Name: "+file.getName());
		}
		String s = file.getAbsolutePath();
		FileWriter file_writer = new FileWriter(s);
		file_writer.write("JAVA CLASS....Mon-Thurs\n 9:30 am\ntoday's text");
		file_writer.close();
	}
}
