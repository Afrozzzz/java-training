package Java8Features;

import java.util.Arrays;
import java.util.Optional;
import java.util.StringJoiner;
public class StringJoinerEx {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringJoiner sj=new StringJoiner(" , ");
sj.add("name1");
sj.add("name2");
sj.add("name3");
System.out.println(sj.toString());
StringJoiner sj2=new StringJoiner(" ,");
sj2.add("name1");
sj2.add("name2");
sj2.add("name3");
System.out.println(sj2.toString());

//optional class -> helps in avoiding nullpointerexception
Optional<String>name =Optional.of("java");
Optional<String>name2 =Optional.empty();
name.ifPresent(n->System.out.println("name is :"+n));
name2.ifPresent(n->System.out.println("name is :"+n));
 

//arrays parallel sort
// performance ->array->sort
double[] stockPrice = {123.34,234.45,112.34,231.11,121.12};
Arrays.parallelSort(stockPrice);
System.out.println("sorted array : pararelly:"+Arrays.toString(stockPrice));
	}
 
}