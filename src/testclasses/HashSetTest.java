package testclasses;

import java.util.HashSet;
import java.util.Iterator;

import EmployeeDetials.Employee;
 

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> set = new HashSet<String>();
		
		set.add("gireesh");
		set.add("riyaz");
		set.add("rupesh");
		set.add("chethan");
		
		Iterator itr = set.iterator();
		
		//concurrent modification error generaiton
		while(itr.hasNext())
		{
			String val = itr.next().toString();
			System.out.println("set values--->>"+val);
			
			if(val.equalsIgnoreCase("rupesh"))
			{
				set.remove("rupesh");
			}
		}
		set.add("chethan");
		System.out.println("Final values--->>"+set);
		

	}

}
