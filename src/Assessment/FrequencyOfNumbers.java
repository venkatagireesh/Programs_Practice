package Assessment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfNumbers {


    // This function prints frequencies of all elements
    static void printFreq(int arr[])
    {
        // Creates an empty HashMap
        HashMap<Integer, Integer> hmap = 
                     new HashMap<Integer, Integer>();
 
        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            Integer c = hmap.get(arr[i]);
 
            // If this is first occurrence of element 
            if (hmap.get(arr[i]) == null)
               hmap.put(arr[i], 1);
 
            // If elements already exists in hash map
            else
              hmap.put(arr[i], ++c);
        }
 
        // Print result
        for (Map.Entry m:hmap.entrySet())
          System.out.println("Frequency of " + m.getKey() + 
                             " is " + m.getValue());
        
        Map<Integer, Long> hmap1 = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(hmap1);
        
    }
 
    // Driver method to test above method
    public static void main (String[] args)
    {
        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        printFreq(arr);
    }

}
