package java8programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeAndSort {
	
	private static int[] mergeAndSort(Integer[] arr1, Integer[] arr2) {
		
		int[] a1 = Arrays.stream(arr1).mapToInt(i->i).toArray();
		int[] a2 = Arrays.stream(arr2).mapToInt(i->i).toArray();
		
		int [] result = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().toArray();
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}		
				
		return null;
	}

	public static void main(String[] args) {

		Integer[] arr1 = new Integer[] {1,3,7,9,15,20,60};
		Integer[] arr2 = new Integer[] {2,5,8,14,19,50};
		
		int result[] = mergeAndSort(arr1, arr2); //another approach using java 8 streams
		
		int[] mergedArray = new int[arr1.length+arr2.length];
		
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			mergedArray[i]=arr1[i];
			index=i;
		}
		index=index+1;
		for(int i=0;i<arr2.length;i++) {
			mergedArray[index]=arr2[i];
			index++;
		}
		System.out.println();
		System.out.println("Merged Array: Before Sorting:");
		for(int i=0;i<mergedArray.length;i++) {
			System.out.print(mergedArray[i]+" ");
		}
		System.out.println();
		for(int i=0;i<mergedArray.length;i++) {
			for(int j=i+1;j<mergedArray.length;j++) {
				if(mergedArray[i]>mergedArray[j]) {
					int temp = mergedArray[j];
					mergedArray[j]=mergedArray[i];
					mergedArray[i]=temp;
				}
			}
		}
		System.out.println("Merged Array: After Sorting:");
		
		for(int i=0;i<mergedArray.length;i++) {
			System.out.print(mergedArray[i]+" ");
		}
	}

}
