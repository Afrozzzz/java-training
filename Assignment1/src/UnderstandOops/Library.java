package UnderstandOops;
 
import java.util.Scanner;
 
public class Library {
	private Book book1;
	private Book book2;
	public void addBook() {
		if(book1==null) {
			System.out.println("\n Adding Book1:");
			book1= new Book();
			book1.inputBookDetails();
		} else if (book2==null) {
			System.out.println("\n Adding book2:");
			book2 =new Book();
			book2.inputBookDetails();
		}else {
			System.out.println("Library is full ,remove any one book");
		}
	}
	@SuppressWarnings("resource")
	public void removeBook() {
		Scanner sc =new Scanner(System.in);
		if(book1==null && book2==null) {
			System.out.println("No books to remove");
			return;
		}
		System.out.println("please enter the title:");
		String titleToRemove=sc.nextLine();
		if(book1!=null && book1.getTitle().equalsIgnoreCase(titleToRemove)) {
			book1=null;
			System.out.println("Book1 removed successfully");
		}else if(book2!=null && book2.getTitle().equalsIgnoreCase(titleToRemove)) {
			book2=null;
			System.out.println("Book2 removed successfully");
		}else {
			System.out.println("Book not found");
		}
		sc.close();
	}
	@SuppressWarnings("resource")
	public void updateBook() {
		Scanner sc =new Scanner(System.in);
		if(book1==null && book2==null) {
			System.out.println("No books to update");
			return;
		}
		System.out.println("please enter the title:");
		String titleToUpdate =sc.nextLine();
		Book bookToUpdate=null;
		if(book1 !=null && book1.getTitle().equalsIgnoreCase(titleToUpdate)) {
			bookToUpdate =book1;
		}else if(book1 !=null && book1.getTitle().equalsIgnoreCase(titleToUpdate)) {
			bookToUpdate =book1;
		}else {
			System.out.println("Book not found");
		}
		System.out.println("Updating Book Details:");
		System.out.println("Enter new Title");
		String newTitle =sc.nextLine();
		if(!newTitle.isEmpty()) {
			bookToUpdate.setTitle(newTitle);
		}
		System.out.println("Enter new Author");
		String newAuthor =sc.nextLine();
		if(!newAuthor.isEmpty()) {
			bookToUpdate.setTitle(newAuthor);
		}
		System.out.println("Enter new ISBN");
		String newIsbn =sc.nextLine();
		if(!newIsbn.isEmpty()) {
			bookToUpdate.setTitle(newIsbn);
		}
		System.out.println("Book details submitted successfully");
		sc.close();
	}
	public void displayBooks() {
		if(book1 ==null && book2==null) {
			System.out.println("No books in the Library");
			return;
		}
		System.out.println("Library Books:");
		if(book1!=null) book1.displayBook();
		if(book2!=null) book2.displayBook();
	}

 
}