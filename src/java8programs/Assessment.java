package java8programs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import EmployeeDetials.Employee2;



public class Assessment {
	
	public static void main(String[] args) {	
		
		String value1 = "Hello";
		String value2 = new String("Hello");
		String value3 = value2.intern();
		System.out.println(value1==value3);
		
		String s1 = "A", s2="a", s3 = "b";
		s1.toLowerCase();
		s3.replace('b', 'a');
		System.out.println((s1.equals(s2)) +","+ (s2.equals(s3)) );	
		

		new Assessment().display("Hockey");
		new Assessment().display("kho-kho", 1,2,3);
	}	
	public static void display(String name, int... iDs) {
		System.out.print(name + ":");
		for(int i=0;i<iDs.length;i++) {
			System.out.println(iDs[i] + "");
		}
	}

}
