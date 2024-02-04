package java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> list = Arrays.asList("a", "a", "f", "h", "s", "d", "f", "h", "x");

        Map<String, Long> elementCountMap = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(elementCountMap);

        // Filter out elements that occur only once
        List<String> duplicates = elementCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicates);
        
        List<String> distinctData = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct elements: "+ distinctData);

	}

}
