//public class ExceptionHandling {
// 
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a=10;
//		int b=0;
//		try
//		{
//			int result =a/b;
//		}
//		catch(Exception e)
//		{
//			System.out.println("exception caugth: "+e.getMessage());
//		}
//		finally
//		{
//			System.out.println("--------");
//		}
// 
//	}
// 
//}






public class ExceptionHandling {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int[] arr= {10,3,4,56};
		try
		{
			int result =a/b;
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caugth: "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception caught: "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("exception caugth: "+e.getMessage());
		}
		finally
		{
			System.out.println("--------");
		}
 
	}
 
}