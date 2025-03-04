package MultithreadingSer;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class DeserializationApp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//person.ser
		//input operation
		// byte->object
		//IOException
		try
		{
			FileInputStream file =new FileInputStream("Person.ser");
			ObjectInputStream in =new ObjectInputStream(file);
 
			Person person =(Person) in.readObject();
			in.close();
			file.close();
			System.out.println("deserialized:"+person);

 
		}
		catch(IOException| ClassNotFoundException e)
		{
			System.out.println("exception caught"+e.getMessage());
		}
	}
 
}