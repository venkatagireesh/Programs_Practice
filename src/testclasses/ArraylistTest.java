package testclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArraylistTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		SortedSet<String> set = new TreeSet<String>();
		
		list.add("123");
		list.add("523");
		list.add("333");
		list.add("555");
		list.add("235");

		//System.out.println("Before sorting--->>"+list);
		
		set.addAll(list);
		//System.out.println("After sorting--->>"+set);
		
		String maxval = set.last();
		//System.out.println(maxval);	
		
		
		String temp = "19";
		
		if(temp.startsWith("0"))
		{
			temp  = temp.substring(1);
		}
		//System.out.println("temp--->>"+temp);
		
		ArrayList<Integer> daylist = new ArrayList<Integer>();
		
		daylist.add(12);
		daylist.add(9);
		daylist.add(11);
		daylist.add(14);
		daylist.add(13);
		
		int max = Collections.max(daylist);
		
		//System.out.println("Max day--->>"+max);
		
		
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("123");
		list1.add("523");
		list1.add("333");
		list1.add("555");
		list1.add("235");		
		
		System.out.println("list1-->>"+list1);
		
		String listtostring = list1.toString();
		
		System.out.println("listtostring--->>>"+listtostring);
		
	}

}
