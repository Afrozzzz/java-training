package UnderstandOops;
 
import java.util.Scanner;
 
class Book {
	private String title;
	private String author;
	private String isbn;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	public Book() {
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void displayBook() {
		System.out.println("Book details:");
		System.out.println("Title :"+getTitle());
		System.out.println("Author:"+getAuthor());
		System.out.println("ISBN:"+getIsbn());
	}
	public void inputBookDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter book Title: ");
		setTitle(sc.nextLine());
		System.out.print("Enter book Author: ");
		setAuthor(sc.nextLine());
		System.out.print("Enter book ISBn: ");
		setIsbn(sc.nextLine());
		sc.close();
	}
//	public void updateBookDetails() {
//		Scanner sc=new Scanner(System.in);
//		System.out.printf("update details:");
//		System.out.printf("Enter new Title ");
//		String newTitle=sc.nextLine();
//		if(!newTitle.isEmpty()) {
//			setTitle(newTitle);
//		}
//		
//		System.out.printf("Enter new author ");
//		String newAuthor=sc.nextLine();
//		if(!newAuthor.isEmpty()) {
//			setTitle(newAuthor);
//		}
//		
//		System.out.printf("Enter new Isbn ");
//		String newIsbn=sc.nextLine();
//		if(!newIsbn.isEmpty()) {
//			setTitle(newIsbn);
//		}
//		sc.close();
//	}
	public boolean isValidIsbn(String isbn) {
		return isbn.matches("\\d{10}") || isbn.matches("\\d{13");
	}
}