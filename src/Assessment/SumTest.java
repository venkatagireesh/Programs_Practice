package Assessment;

import java.util.HashMap;

public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,7,11,15};
		
		
//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j=i+1;j<arr.length;j++) {
//				
//				int sum = arr[i]+arr[j];
//				
//				if(sum==9) {
//					System.out.println("Index's are:"+i+","+j);
//				}
//			}
//			
//		}
		
        int target = 9;

        // Create a HashMap to store elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            
            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                System.out.println("Index's are: " + map.get(complement) + "," + i);
                break; // Exit loop since we only need one pair
            }
            
            // If complement doesn't exist, put the current element and its index into the HashMap
            map.put(arr[i], i);
        }

	}

}
