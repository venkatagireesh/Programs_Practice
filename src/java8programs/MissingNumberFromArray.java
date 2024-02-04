package java8programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,4,6,3,7,8,9};
		int maxNumber = Arrays.stream(numbers).max().getAsInt();
		System.out.println("maxNumber: "+maxNumber);
		
		int actualSum = Arrays.stream(numbers).sum();
		System.out.println("actualSum: "+actualSum);
		
		int expectedSum = maxNumber*(maxNumber+1)/2;
		System.out.println("expectedSum: "+expectedSum);
		
		int missingNumber = expectedSum-actualSum;
		System.out.println("Missing number is "+missingNumber);
		
	}

}
