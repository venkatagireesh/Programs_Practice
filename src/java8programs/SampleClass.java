package java8programs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {2, 4,5,66,32, 33};
		
		
		double sum = Arrays.stream(arr).mapToDouble(n->n).sum();
		System.out.println(sum);
		
		String name  = "venkatagireeshsakala";
		
		
		Map<String,Long> countofLetters = Arrays.stream(name.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(countofLetters);
		

	}

}
