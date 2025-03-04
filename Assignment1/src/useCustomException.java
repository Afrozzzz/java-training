import java.io.FileReader;

import java.io.IOException;
import java.util.Scanner;
 
//public class C1 {
//static void checkage(int age)
//{
//	 if(age<18)
//	 {
//		 throw new ArithmeticException("not eligible to open bank account");
//		 }
//	 System.out.println("eligible to open bankaccount");
//}
////methods for throws
//static void readFile() throws IOException
//{
//	 FileReader file =new FileReader("xyz.txt");
//}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		checkage(22);
//		try
//		{
//			readFile();
//		}
//		catch(IOException e)
//		{
//			System.out.println("exception handled :"+e.getMessage());
//		}
// 
//	}
// 
//}

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
 
//use
class useCustomException
{
	static void validateage(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("age must be grater than 18 to open a  bank account");
		}
		else
		{
			System.out.println("valid age.account can be opened");
		}
	}
		public static void main(String[] args)
		{
			try
			{
				validateage(22);
			}
			catch(InvalidAgeException e)
			{
			System.out.println("exception caught :"+e.getMessage());	
			}
		}
	}
 
