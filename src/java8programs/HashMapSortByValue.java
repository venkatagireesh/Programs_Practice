package java8programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortByValue {

	public static void main(String[] args) {
		
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("a",1);
		unsortedMap.put("c",3);
		unsortedMap.put("b",2);
		unsortedMap.put("e",5);
		unsortedMap.put("d",4);
		
		System.out.println("--Before sorting----");
		System.out.println(unsortedMap);

		LinkedHashMap<String, Integer> sortedMap = unsortedMap.entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByValue())
		    .collect(Collectors.toMap(
		        Map.Entry::getKey,
		        Map.Entry::getValue,
		        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println("--After sorting by value----");
		System.out.println(sortedMap);
		
		LinkedHashMap<String, Integer> sortedMapKey = unsortedMap.entrySet()
			    .stream()
			    .sorted(Map.Entry.comparingByKey())
			    .collect(Collectors.toMap(
			        Map.Entry::getKey,
			        Map.Entry::getValue,
			        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

			System.out.println("--After sorting by key----");
			System.out.println(sortedMapKey);
		
		

	}

}
