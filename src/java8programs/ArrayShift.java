package java8programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArrayShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7};
		List<Integer> numlist = new ArrayList<>();		
		for(int i:arr) {
			numlist.add(i);
		}		
		List<Integer> outlist = new ArrayList<>();
		int k=2;
		int len = numlist.size();	
		int limit = len-k;
		for(int i=limit;i<len;i++) {
			outlist.add(numlist.get(i));
		}
		for(int i=0;i<limit;i++) {
			outlist.add(numlist.get(i));
		}
		System.out.println(outlist);

		
	}

}
