package java8programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ramu is a boy and Sita is a girl";
		String strarr [] = str.split(" ");
		List<String> strList = Arrays.asList(strarr);
		
		Map<Object, Long> strCountMap = strList.stream().collect(Collectors.groupingBy(s->s.toString(), Collectors.counting()));
		System.out.println(strCountMap);
		
		

	}

}
