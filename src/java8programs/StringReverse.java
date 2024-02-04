package java8programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "StringReverse";
		
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());
		
		String output = Arrays.stream(input.split("")).reduce("", (s1,s2)->s2+s1);
		System.out.println(output);
		
		String output1 = Arrays.asList(input).stream()
				.map(s-> new StringBuilder(s).reverse().toString())
				.collect(Collectors.toList()).get(0);
		System.out.println(output1);
		

	}

}
