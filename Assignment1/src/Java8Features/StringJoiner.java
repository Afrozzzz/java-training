package Java8Features;

public class StringJoiner {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(" : ");
				sj.add("Name1");
		sj.add("Name2");
		sj.add("Name3");
		System.out.println(sj.toString());
		
		
		StringJoiner sj2 = new StringJoiner("  ,  ","\")
				sj.add("Name1");
		sj2.add("Name2");
		sj2.add("Name3");
		System.out.println(sj2.toString());
		
		
		
	}
}
