package java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetEvenIndexedStringsFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("a", "b", "f", "h", "s", "d", "f", "h", "x");
		
		String arr [] = list.stream().toArray(String [] :: new);
		
		List<String> evenIndexedStrings = IntStream.range(0, arr.length)
				.filter(i->i%2==0)
				.mapToObj(i->arr[i])
				.collect(Collectors.toList());
		
		System.out.println(evenIndexedStrings);
		
		
		List<Integer> evenNumbers = IntStream.range(0, 10)
				.filter(i->i%2==0)
				.mapToObj(i->i)
				.collect(Collectors.toList());
		System.out.println(evenNumbers);

	}

}
