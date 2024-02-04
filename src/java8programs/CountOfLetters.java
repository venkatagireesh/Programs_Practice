package java8programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString = "TataConsultancy";
		
	
		
		List<Character> charList = myString.chars().mapToObj(c-> (char) c).collect(Collectors.toList());
		System.out.println(charList);
        
        Map<Character,Long> strCntMap = charList.stream().collect(Collectors.groupingBy(s->(char)s , Collectors.counting()));
        
        Map<String, Long> strCntMap1 = Arrays.stream(myString.split(""))
        		//.map(String::toLowerCase)
        		.collect(Collectors.groupingBy(s->s, Collectors.counting()));
        
        System.out.println(strCntMap1);

	}

}
