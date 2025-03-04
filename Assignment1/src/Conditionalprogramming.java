import java.util.Scanner;
 
public class Conditionalprogramming {
 
	public static void main(String[] args) {
//		double rating = 5;
//		double salary = 10000;
//		if (rating >= 1 && rating <= 2) {
//			System.out.println(salary);
//		} else if (rating > 2 && rating <= 3.5) {
//			System.out.println(salary * 5);
//		} else if (rating > 3.5 && rating <= 4.5) {
//			System.out.println(salary * 8);
//		} else if (rating > 4.5 && rating < 5) {
//			System.out.println(salary * 10);
//		} else {
//		  System.out.println("No valid rating given above."); }



try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter the current salary:");
	  double currsalary =sc.nextDouble();
	  System.out.println("Enter the rating");
	  int rating=sc.nextInt();
	  double hikepercentage=0.0;
	  switch(rating) {
		  case 5:
			  hikepercentage=0.20;
			  break;
		  case 4:
			  hikepercentage=0.15;
			  break;
		  case 3:
			  hikepercentage=0.10;
			  break;
		  case 2:
			  hikepercentage=0.5;
			  break;
		  case 1:
			  hikepercentage=0.1;
			  break;
		 default:
			 System.out.println("Invalid Rating.");
	  }
	 double newsalary=currsalary+(currsalary * hikepercentage);
	 System.out.println(newsalary);
	 sc.close();
}
	}
 
}