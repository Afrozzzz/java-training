package MultithreadingSer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 
public class SerializationApp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person objp=new Person("rose",123456);
		try
		{
			FileOutputStream file =new FileOutputStream("Person.ser");
			java.io.ObjectOutputStream out =new ObjectOutputStream(file);
			out.writeObject(objp);
			out.close();
			file.close();
			System.out.println("object is serialized");
		}
		catch(IOException e)
		{
			System.out.println("exception caught:"+e.getMessage());
		}
 
	}
 
}