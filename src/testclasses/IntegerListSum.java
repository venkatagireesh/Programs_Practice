package testclasses;

import java.util.ArrayList;

public class IntegerListSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> listoflist = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);

		list2.add(4);
		list2.add(5);
		list2.add(6);

		list3.add(7);
		list3.add(8);
		list3.add(9);

		listoflist.add(list1);
		listoflist.add(list2);
		listoflist.add(list3);

		System.out.println("Input list--->>>"+listoflist);
		ArrayList<Integer> templist = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0;i<listoflist.size();i++)
		{
			templist.addAll(listoflist.get(i));
			//System.out.println("temp list--->>>"+templist);
	
			for(int j=0;j<templist.size();j++)
			{
				sum = sum+templist.get(j);
			}
			//System.out.println("sum-->>"+sum);
			list4.add(sum);
			sum = 0;
			templist.clear();
		}

		System.out.println("Output list--->>>"+list4);		

	}

}
