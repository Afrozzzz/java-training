package Java8Features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.security.*;
 
interface Maths
{
	int operate(int a,int b);
}
 
 
public class  Java8Features {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths add =(a,b)->a+b;
		System.out.println(add.operate(66, 66));
		Maths sub=(a,b)->a-b;
		System.out.println(sub.operate(100, 99));
		List<String>names=Arrays.asList("name2","name1","name3");
		List<String>names2=new ArrayList<>();
		List<Integer>numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer>evenNumbers =numbers.stream().filter(n-> n%2==0).collect(Collectors.toList()); //converted it to stream of values
		List<Integer>incNumbers =numbers.stream().map(n->n+10).collect(Collectors.toList()); //converted it to stream of values
 
		//.sum()
		int resultSum = numbers.stream().map(n->n*2).mapToInt(Integer::intValue).sum();
		System.out.println(resultSum);
		names2.add("java");
		names2.add("trainig");
		names.sort((s1,s2)-> s1.compareTo(s2));
		System.out.println(names);
		
		System.out.println(evenNumbers);
		System.out.println(incNumbers);

		names2.forEach(name-> System.out.println(name));
 
	}
 
}