package testclasses;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class DuplicatesInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("gold");
		list1.add("lulu");
		list1.add("lulu");
		list1.add("classic");
		list1.add("lulu");
		list1.add("infinite");
		list1.add("infinite");
		
		System.out.println("Before-->>"+list1);
		
		for(int i=0;i<list1.size();i++)
		{
			//System.out.println("value--->>"+list);
			String name1 = list1.get(i);
			//System.out.println("name1-->>"+name1);
			int c=0;
			for(int j=0;j<list1.size();j++)
			{
				String name2 = list1.get(j);
				
				if(name2.equalsIgnoreCase(name1))
				{
					c++;
				}
			}
			if(c>1)
			{
				list2.add(name1);
			}
			
		}
		
		System.out.println("Duplicates-->>"+list2);
		
		LinkedHashMap<Integer,String> list3 = new LinkedHashMap<Integer,String>();
		
		for(int i=0;i<list2.size();i++)
		{
			String val1 = list2.get(i);
			
			for(int j=0;j<list2.size();j++)
			{
				String val2 = list2.get(j);
				
				if(val1.equalsIgnoreCase(val2))
				{
					//System.out.println("index val--->>>"+j);
					list2.remove(j);
				}
				else
				{
					
				}
			}
		}
		
		System.out.println("Final-->>"+list2);
		
	}

}
