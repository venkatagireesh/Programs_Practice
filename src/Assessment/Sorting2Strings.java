package Assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting2Strings {
	
    public static String sortString(String input) {
    	
    	char[] chars = input.toCharArray();
        Arrays.sort(chars);
        StringBuilder sorted = new StringBuilder();
        int lowercaseIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                sorted.append(chars[i]);
                lowercaseIndex++;
            } else {
                break;
            }
        }
        for (int i = lowercaseIndex; i < chars.length; i++) {
            sorted.append(chars[i]);
        }
        return sorted.toString();
    	
    }

	public static void main(String[] args) {

		//input: gEeksfOraEEkS   
		//output:aEefgkEkrEOsS
		String input = "gEeksfOraEEkS";
		System.out.println("Input:"+input);
		String output = sortString(input);
		System.out.println("Output:"+output);
		
		
		

	
	}

}
