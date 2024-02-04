package java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LargestStringUsingReduce {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                 "GeeksQuiz", "GeeksforGeeks","GeeksforGeekd"); 
		
		Optional<String> longestString = words.stream()
				.reduce((word1, word2)->word1.length()>word2.length() ? word1 : word2);
		
		longestString.ifPresent(System.out::println);
		
		
		List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8); 		
		int sum = array.stream().reduce(0, 
                (element1, element2) -> element1 + element2);
		System.out.println("Sum="+sum);


	}

}
