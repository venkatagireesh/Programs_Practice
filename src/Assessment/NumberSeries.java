package Assessment;

import java.util.ArrayList;
import java.util.List;

public class NumberSeries {

	public static void main(String[] args) {
				
		Integer i1 =10;
		Integer i2=10;
		 
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);
		System.out.println("10".equals(i1));
		System.out.println(i1.equals("10"));
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
		int k=3;
		int n = arr.length;

		for (int i = 0; i < n; i =i+ k)
        {
            int left = i;
     
            // to handle case when k is not multiple
            // of n
            int right = Math.min(i + k - 1, n - 1);
            int temp;
             
            // reverse the sub-array [left, right]
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }
		System.out.println();
		for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

	}

}
