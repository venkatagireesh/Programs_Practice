package Assessment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input : 5,9,12,14,56,45
		//output: 0:2,1:2,5:1,4:1
		
		List<String> numList = Arrays.asList("5","9","4","456","12","14","56","45");
		Map<String,Integer> counterMap = new HashMap<>();
		
		int count=0;
		for(int i=0;i<numList.size();i++) {			
			String val = numList.get(i);
			//System.out.println("val lenght:"+val.length());
			if(val.length()==1) {
				count++;				
			}			
			else if(val.length()>1) {
				String val1 = val.substring(0, 1);
				//System.out.println("val1:"+val1);
				int count1=0;
				for(int j=0;j<numList.size();j++) {
					String val2 = numList.get(j);
					if((val2.length()>1) && val2.startsWith(val1)) {
						count1++;
					}
				}
				counterMap.put(val1, count1);
			}
			counterMap.put("0", count);
		}
		System.out.println("Map:"+counterMap);
		
		

	}

}
