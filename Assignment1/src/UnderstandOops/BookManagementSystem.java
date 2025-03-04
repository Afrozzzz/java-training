package UnderstandOops;
 
import java.util.Scanner;
 
public class BookManagementSystem {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();
		System.out.println("Book management System :");
		while (true) {
			System.out.println("\n choose an option:");
			System.out.println("Add a Book");
			System.out.println("Remove a Book");
			System.out.println("Update a Book");
 
			System.out.println("Display Books");
			System.out.println("Exit");
			System.out.print("Enter Choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
 
				lib.addBook();
				break;
			case 2:
 
				lib.removeBook();
				break;
			case 3:
 
				lib.updateBook();
				break;
			case 4:
 
				lib.displayBooks();
				break;
			case 5: 
                System.out.println("Existing Book Management System:");
                sc.close();
                return;

 
			default:
				System.out.println("Invalid choice type");
			}
		}
 
	}
 
}