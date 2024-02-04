package java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLargestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                "GeeksQuiz", "GeeksforGeeks","GeeksforGeekd");
		
		Map<Integer, List<String>> map = words.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println("grouping by size::");
		System.out.println(map);
		
		List<String> largestStrings = map.entrySet().stream()
				.max(Map.Entry.comparingByKey())
				.map(Map.Entry::getValue)
				.get();
		System.out.println("Largest Strings:");
		System.out.println(largestStrings);
		
		
		List<String> strings = words.stream()
				.collect(Collectors.groupingBy(String::length))
				.entrySet().stream()
				.max(Map.Entry.comparingByKey())
				.map(Map.Entry::getValue).get();
		System.out.println(strings);

	}

}
