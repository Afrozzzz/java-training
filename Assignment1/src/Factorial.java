import java.util.Scanner;
 
public class Factorial {
	public static int calculateFactorial(int num) {
		if(num<0) {
			System.out.println("Factorial is not defined for negative numbers");
			return -1;
		}
		if(num ==0 ||num==1) {
			return 1;
		}
		 return num *calculateFactorial(num-1);

 
		}
 
 
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("please enter the number");
int number=sc.nextInt();
int result=calculateFactorial(number);
System.out.println(result);
sc.close();
 
	
	}
}