package testclasses;

import java.util.ArrayList;

public class LibraryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input1[]  = {34,67,8,98,34,2,34,65,76,-1};
		int input2[] = {8,25,34,98,-1};
		int input3[] = new int[101];
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		int temp = -1;
		
		for (int i = 0; i <= input1.length-2; i++) 
		{
			
			list1.add(input1[i]);
		}
		
		for (int i = 0; i <= input2.length-2; i++) 
		{
			
			list2.add(input2[i]);
		}
		boolean flag = true;
		for (int i = 0; i < list2.size(); i++) 
		{
			flag = true;
			for(int j=0;j<list1.size();j++)
			{
				if(list2.get(i) == list1.get(j))
				{
					list3.add(j+1);
					list1.remove(j);
					flag = false;
					break;
				}				
			}
			if(flag)
			{
				list3.add(-1);
			}
			
		}
		
		for(int i=0;i<list3.size();i++)
		{
			input3[i]=list3.get(i);
		}
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		//System.out.println(input3);
		
		

	}

}
