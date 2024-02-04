package java8programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyWith3ForEvenNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> numList = list.stream().filter(num->num%2==0)
									.map(num->{
										num = num*3;
										return num;
									}).collect(Collectors.toList());
		numList.sort(Collections.reverseOrder());
		System.out.println(numList);
									

	}

}
