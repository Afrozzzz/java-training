public class Strings {

	public static void main(String[] args) {
/*String pwd = "Admin007";
Scanner scanner = new Scanner(System.in);
System.out.println("Enter password:");

String userPassword = scanner.nextLine();
if(pwd.equalsIgnoreCase(userPassword)) {
	System.out.println("Access Granted!");
}
else {
	System.out.println("Incorrect Password.Try Again.");
}
scanner.close();*/
		
		
		StringBuffer str = new StringBuffer("Java"); // FSD training is added to original location
		System.out.println(str);
		
		// add some new content -> append() -> combine at end of the string
		str.append("FSD Training");
		System.out.println(str);
		
		//insert at some particular location -> insert()
		str.insert(8, "Day2 ");
		System.out.println(str);
		
		//replace ->
		str.replace(8, 11,"Genpact");
		System.out.println(str);
		
		// delete part of string -> starts with index and deleted till index 1 less than end index
		str.delete(4, 7);
		System.out.println(str);
		
		// reverse()
		str.reverse();
		System.out.println(str);
}
	}


