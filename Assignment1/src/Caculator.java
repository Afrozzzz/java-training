import java.util.Scanner;
 
public class Caculator {
 
//	public static void main(String[] args) {
//		int a=12;
//		int b=6;
//		System.out.println("Addition:"+(a+b)+", Subtraction:"+(a-b)+",Multiplication:"+(a*b)+",Division:"+(a/b));
//
//	}
//	public static void main(String[] args) {
//		
//		int a=9;
//		int b=8;
//		int addition= add(a,b);
//		int multiplication =mult(a,b);
//		int subtraction= sub(a,b);
//	System.out.println(addition+subtraction+multiplication);
//	}
//
// static int mult(int a, int b) {
//		return a*b;
//	}
//
// static int sub(int a, int b) {
//	return a-b;
//}
//
// static int add(int a, int b) {
//	return a+b;
//}
//	
	public static int add(int a, int b)
	{
		int c= a+b;
		return c;
	}
	public static void check(int a)
	{
		if(a%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	public static void greeting(String name)
	{
		System.out.println("Welcome "+name);
	}
	public static int cube(int a)
	{
		return a*a*a;
	}
	public static int factorial(int a)
	{
		int ans=1;
		if(a==0||a==1)
		{return 1;}
		for(int i=1;i<a;i++)
		{
			ans*=i;
		}
		return ans;
	}
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		check(n);
		System.out.println(cube(n));
		System.out.println(factorial(n));
		System.out.println("Enter your name");
		String str;
		sc.nextLine();
		str= sc.nextLine();
		greeting(str);
		sc.close();
	}
}