package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class BankBalance 
{
	public static void main(String[] args) throws IOException
	{
		//I AM CREATING A FILE
		File file = new File("bank_balance.txt");
		File newfile = new File("transactions.txt");
		//I AM CREATING AN OBJECT THAT WILL EDIT THE FILE
		FileWriter file_writer = new FileWriter(file);
		//can use write method on file_Writer
		file_writer.write("900");
		//stops editing the file
		file_writer.close();
		//scanner reads the content of the file object
		Scanner obj = new Scanner(file);
		int amount = 0;
		while(obj.hasNext()) 
		{
			amount = Integer.parseInt(obj.nextLine());
			System.out.println("$ " + amount + "\n");
		}
		//ask the user to withdraw
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Amount of money to withdraw: ");
		int withdraw = keyboard.nextInt();
		if (withdraw>amount) 
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			int new_amount = amount-withdraw;
			String newAmount = ""+new_amount;
			File file1 = new File("bank_balance.txt");
			FileWriter file_writer_1 = new FileWriter(file1);
			file_writer_1.write(newAmount);
			FileWriter newfile_writer = new FileWriter(newfile);
			System.out.println("withdrawal was successful " + withdraw);
			newfile_writer.write("withdrawal of "+withdraw);
			file_writer_1.close();
			newfile_writer.close();
		}
}
}
