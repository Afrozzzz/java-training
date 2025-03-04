import java.util.Scanner;
 
public class WhileLopping {
 
	public static void main(String[] args) {
		/*
		 * int i = 1; int sum = 0; while (i <= 10) { sum += i; i++;
		 * System.out.println(sum); }
		 */

	//second code
//	   int i=1;
//	   int sum=0;
//	   while(i<=20) {
//		   if(i%2==0) {
//			   sum +=i;
//			   
//			   
//		   }
//		   i++;
//	   }
//	   System.out.println(sum);


	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the number");
	int number = sc.nextInt();
	if (number < 0) {
		System.out.println("negative numbers not performed");
	} else {
		long factorial = 1;
		int i = 1;
		while (i <= number) {
			factorial = factorial * i;
			i++;
		}
		System.out.println(factorial);
	}
	sc.close();

	}
 
}