package java8programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MinMaxSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = Arrays.asList(2, 1, 4, 6, 8); 
		
		int max = numList.stream().mapToInt(num->num).max().getAsInt();
		System.out.println("Max:"+max);
		double min = numList.stream().mapToDouble(num->num).min().getAsDouble();
		System.out.println("Min:"+min);
		int sum = numList.stream().mapToInt(num->num).sum();
		System.out.println("Sum:"+sum);
		double avg = numList.stream().mapToInt(num->num).average().getAsDouble();
		System.out.println("Avg:"+avg);
		
		IntSummaryStatistics stats = numList.stream().mapToInt(num->num).summaryStatistics();
		System.out.println(stats);
		
		System.out.println();
		System.out.println("using method references");
		int max1 = numList.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
		System.out.println("Max:"+max1);
	}

}
